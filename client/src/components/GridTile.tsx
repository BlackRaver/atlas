import { VFC } from "react";
import { dataT } from "../data";

type GridTileT = {
  data: dataT;
};

const GridTile: VFC<GridTileT> = ({ data }) => {
  return (
    <div className="grid-tile-wrapper">
      <h3>{data.nazwa}</h3>
      <div className="tile-opis">
        <p>Rodzaj {data.rodzaj}</p>
        <p>Występowanie: {data.wystepowanie}</p>
        <p>{data.czy_trujacy ? "Trujący" : "Jadalny"}</p>
        <p>{data.czy_pod_ochrona && "Pod ochroną"}</p>
      </div>
      <div>
        <p>{data.uwagi}</p>
      </div>
    </div>
  );
};

export default GridTile;
