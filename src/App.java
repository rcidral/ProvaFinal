import java.util.Scanner;
import models.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        int op;
        do {
            System.out.println("1 - Cadastrar. ");
            System.out.println("2 - Visualizar. ");
            System.out.println("3 - Editar. ");
            System.out.println("4 - Excluir. ");
            System.out.println("0 - Sair. ");
            try {
                op = scanner.nextInt();
            } catch (Exception e) {
                op = 9;
            }
            switch(op) {
                case 1: {
                    do {
                        System.out.println("1 - Cadastrar Aeromodelo. ");
                        System.out.println("2 - Cadastrar Hangar. ");
                        System.out.println("3 - Cadastrar Pista. ");
                        System.out.println("4 - Cadastrar Voo. ");
                        System.out.println("5 - Cadastrar Companhia. ");
                        System.out.println("0 - Sair. ");
                        try {
                            op = scanner.nextInt();
                        } catch (Exception e) {
                            op = 9;
                        }
                        switch(op) {
                            case 1: {
                                do {
                                    System.out.println("1 - Cadastrar Avião. ");
                                    System.out.println("2 - Cadastrar Jato. ");
                                    System.out.println("3 - Cadastrar Helicóptero. ");
                                    System.out.println("0 - Sair. ");
                                    try {
                                        op = scanner.nextInt();
                                    } catch (Exception e) {
                                        op = 9;
                                    }
                                    switch(op) {
                                        case 1: {
                                            try {
                                               cadastrarAvião();
                                            } catch (Exception e) {
                                               System.out.println("Erro ao cadastrar aeromodelo" + e.getMessage());
                                            }
                                            break;
                                        }
                                        case 2: {
                                            try {
                                                cadastrarJato();
                                            } catch (Exception e) {
                                                System.out.println("Erro ao cadastrar aeromodelo" + e.getMessage());
                                            }
                                            break;
                                        }
                                        case 3: {
                                            try {
                                                cadastrarHelicoptero();
                                            } catch (Exception e) {
                                                System.out.println("Erro ao cadastrar aeromodelo" + e.getMessage());
                                            }
                                            break;
                                        }
                                        default: {
                                                System.out.println("Opção inválida");
                                                break;
                                            }
                                        }
                                    } while (op != 0);
                                    break;
                                }
                                case 2: {
                                    try {
                                        cadastrarHangar();
                                    } catch (Exception e) {
                                        System.out.println("Erro ao cadastrar hangar" + e.getMessage());
                                    }
                                    break;
                                }
                                case 3: {
                                    try {
                                        cadastrarPista();
                                    } catch (Exception e) {
                                        System.out.println("Erro ao cadastrar pista" + e.getMessage());
                                    }
                                    break;
                                }
                                case 4: {
                                    try {
                                        cadastrarVoo();
                                    } catch (Exception e) {
                                        System.out.println("Erro ao cadastrar voo" + e.getMessage());
                                    }
                                    break;
                                }
                                case 5: {
                                    try {
                                        cadastrarCompanhia();
                                    } catch (Exception e) {
                                        System.out.println("Erro ao cadastrar companhia" + e.getMessage());
                                    }
                                    break;
                                }
                            default: {
                                System.out.println("Opção inválida.");
                                break;
                            }
                        }
                    } while (op != 0);
                break;
                }
                case 2: {
                    do {
                        System.out.println("1 - Listar Avião");
                        System.out.println("2 - Listar Helicóptero");
                        System.out.println("3 - Listar Jato");
                        System.out.println("4 - Listar Hangar");
                        System.out.println("5 - Listar Pista");
                        System.out.println("6 - Listar Voo");
                        System.out.println("7 - Listar Companhia");
                        System.out.println("0 - Voltar");
                        try {
                            op = scanner.nextInt();    
                        } catch (Exception e) {
                            op = 9;
                        }
            
                        switch (op) {
                            case 1: {
                                try {
                                    Aviao.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar avião" + e.getMessage());
                                }
                                break;
                            }
                            case 2: {
                                try {
                                    Helicoptero.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar helicóptero" + e.getMessage());
                                }
                                break;
                            }
                            case 3: {
                                try {
                                    Jato.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar jato" + e.getMessage());
                                }
                                break;
                            }
                            case 4: {
                                try {
                                    Hangar.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar hangar" + e.getMessage());
                                }
                                break;
                            }
                            case 5: {
                                try {
                                    Pista.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar pista" + e.getMessage());
                                }
                                break;
                            }
                            case 6: {
                                try {
                                    Voo.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar voo" + e.getMessage());
                                }
                                break;
                            }
                            case 7: {
                                try {
                                    Companhia.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar companhia" + e.getMessage());
                                }
                                break;
                            }
                            default: {
                                System.out.println("Opção inválida.");
                                break;
                            }
                        }
                    } while (op != 0);
                    break;
                }
                case 3: {
                    do {
                        System.out.println("1 - Editar Avião");
                        System.out.println("2 - Editar Helicóptero");
                        System.out.println("3 - Editar Jato");
                        System.out.println("4 - Editar Hangar");
                        System.out.println("5 - Editar Pista");
                        System.out.println("6 - Editar Voo");
                        System.out.println("7 - Editar Companhia");
                        System.out.println("0 - Voltar");
                        try {
                            op = scanner.nextInt();    
                        } catch (Exception e) {
                            op = 9;
                        }
                    } while (op != 0);
                }
            }
        } while (op != 0);
        scanner.close();
    }

    public static void cadastrarAvião() throws Exception {
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite a marca: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo: ");
        String modelo = scanner.next();
        System.out.println("Digite o prefixo: ");
        String prefixo = scanner.next();
        System.out.println("Digite a capacidade: ");
        int capacidade = scanner.nextInt();
        System.out.println("Digite o id da companhia: ");
        int idCompanhia = scanner.nextInt();

        new Aviao(id, marca, modelo, prefixo, capacidade, Companhia.getById(idCompanhia), idCompanhia);
    }

    public static void cadastrarJato() throws Exception{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite a marca: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo: ");
        String modelo = scanner.next();
        System.out.println("Digite a cor: ");
        String cor = scanner.next();
        System.out.println("Digite a velocidade: ");
        int velocidade = scanner.nextInt();
        new Jato(id, marca, modelo, cor, velocidade);
    }

    public static void cadastrarHelicoptero() throws Exception{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite a marca: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo: ");
        String modelo = scanner.next();
        System.out.println("Digite a cor: ");
        String cor = scanner.next();
        System.out.println("Digite a capacidade: ");
        int capacidade = scanner.nextInt();
        new Helicoptero(id, marca, modelo, cor, capacidade);
    }

    public static void cadastrarHangar() throws Exception{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o local: ");
        String local = scanner.next();
        System.out.println("Digite o id do avião: ");
        int idAviao = scanner.nextInt();
        
        new Hangar(id, local, idAviao, Aviao.getById(idAviao));
    }

    public static void cadastrarPista() throws Exception{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o número: ");
        String numero = scanner.next();
        
        new Pista(id, numero);
    }

    public static void cadastrarVoo() throws Exception{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o número: ");
        String numero = scanner.next();
        System.out.println("Digite a data: ");
        String data = scanner.next();
        System.out.println("Digite a hora: ");
        String hora = scanner.next();
        System.out.println("Digite a origem: ");
        String origem = scanner.next();
        System.out.println("Digite o destino: ");
        String destino = scanner.next();
        System.out.println("Digite o nome do piloto: ");
        String piloto = scanner.next();
        System.out.println("Digite o nome do copiloto: ");
        String copiloto = scanner.next();
        System.out.println("Digite a observação: ");
        String observacao = scanner.next();
        System.out.println("Digite o id da pista: ");
        int idPista = scanner.nextInt();
        System.out.println("Digite o id do helicóptero: ");
        int idHelicoptero = scanner.nextInt();
        System.out.println("Digite o id do jato: ");
        int idJato = scanner.nextInt();
        System.out.println("Digite o id od avião: ");
        int idAviao = scanner.nextInt();

        new Voo(id, numero, data, hora, origem, destino, piloto, copiloto, observacao, idPista, Pista.getById(idPista), idHelicoptero, Helicoptero.getById(idHelicoptero), idJato, Jato.getById(idJato), idAviao, Aviao.getById(idAviao));
    }

    public static void cadastrarCompanhia() throws Exception{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o nome: ");
        String nome = scanner.next();
        System.out.println("Digite o CNPJ: ");
        String cnpj = scanner.next();
        
        new Companhia(id, nome, cnpj);
    }

    public static Scanner scanner = new Scanner(System.in);
}
