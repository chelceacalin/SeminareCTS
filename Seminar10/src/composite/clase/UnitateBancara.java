package composite.clase;

public interface  UnitateBancara {

     default void adaugaUnitate(UnitateBancara unitateBancara){};
     default void stergeUnitate(UnitateBancara unitateBancara){};
     void printDescriere(String indentare);
      default UnitateBancara getUnitate(int pozitie){return  null; };


}
