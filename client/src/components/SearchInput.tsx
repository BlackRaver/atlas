import { ChangeEvent, useState } from "react";

import "./SearchInput.css";

const SearchInput = () => {
  const [searchValue, setSearchValue] = useState("");
  const search = (e: ChangeEvent<HTMLInputElement>) => {
    const data = e.currentTarget.value;
    setSearchValue(data);
  };

  return (
    <div className="search-input-wrapper">
      <input
        type="text"
        value={searchValue}
        onChange={search}
        placeholder="Search"
      />
    </div>
  );
};

export default SearchInput;
