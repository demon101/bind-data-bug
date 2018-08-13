package testb

class CompanyEditCommand {
    Address address
    String name


    @Override
    public String toString() {
        return "CompanyEditCommand{" +
                "address=" + address +
                ", name='" + name + '\'' +
                '}';
    }
}
