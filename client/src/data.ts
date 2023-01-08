export type dataT = {
  id: number;
  nazwa: string;
  rodzaj: string;
  czy_pod_ochrona: boolean;
  czy_trujacy: boolean;
  wystepowanie: string;
  uwagi: string;
};

const data = {
  id: 2,
  nazwa: "Boczniak",
  rodzaj: "Grzyb jadalny",
  czy_pod_ochrona: false,
  czy_trujacy: false,
  wystepowanie: "w Poslce w lesie.",
  uwagi: ".......",
};

export const dataArr = [
  data,
  data,
  data,
  data,
  data,
  data,
  data,
  data,
  data,
  data,
];
