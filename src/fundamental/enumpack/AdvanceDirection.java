package fundamental.enumpack;

public enum AdvanceDirection implements Direction{
    NORTHEAST{
        @Override
        public void showDirection() {
            System.out.println("I am in NORTH-EAST");
        }
    },
    SOUTHWEST{
        @Override
        public void showDirection() {
            System.out.println("I am in SOUTH-WEST");
        }
    },

    SOUTHEAST {
        @Override
        public void showDirection() {
            System.out.println("I am in SOUTH-EAST");
        }
    },

    NORTHWEST {
        @Override
        public void showDirection() {
            System.out.println("I am in NORTH-WEST");
        }
    },
}
