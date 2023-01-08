import { ReactNode, VFC } from "react";
import { dataT } from "../data";

type GridT = {
  renderCallback: (data: dataT) => ReactNode;
  data: dataT[];
};

const Grid: VFC<GridT> = ({ renderCallback, data }) => {
  return (
    <div className="grid">
      {data && data.map((tile) => renderCallback(tile))}
    </div>
  );
};

export default Grid;
