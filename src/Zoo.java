public class Zoo {

    public static class Kletka{



        private String typeAnimal;
        private String color;

        public Kletka(String typeAnimal, String color){
            this.typeAnimal = typeAnimal;
            this.color = color;
        }

        public String getTypeAnimal(){
            return typeAnimal;
        }

        public String getColor(){
            return color;
        }

        public void Golos(){
            System.out.println(typeAnimal + " подает голос!");
        }

        public void Vstal() {
            if (typeAnimal.equals("Кенгуру")) {
                System.out.println(typeAnimal + " встал на хвост!");
            } else {
                System.out.println(typeAnimal + " встал на лапы!");
            }
        }

    }

    public static void main(String[] args) {
        Kletka lev = new Kletka("Лев", "желтый");
        lev.Golos();
        lev.Vstal();

        Kletka kango = new Kletka("Кенгуру", "желтый");
        kango.Golos();
        kango.Vstal();

        Kletka tigr = new Kletka("Тигр", "оранжевый с черным");
        Kletka slon = new Kletka("Слон", "серый");
    }
}
