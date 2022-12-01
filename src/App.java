import java.util.Scanner;

import generic.Aeromodelo;
import models.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        do {
            System.out.println(
                "=======================================" + "\n" +
                "1 - Cadastrar. " + "\n" +
                "2 - Visualizar. " + "\n" +
                "3 - Editar. " + "\n" +
                "4 - Excluir. " + "\n" +
                "0 - Sair" + "\n" +
                "======================================="
            );
            try {
                op = scanner.nextInt();
            } catch (Exception e) {
                op = 9;
            }
            switch(op) {
                case 1: {
                    do {
                        System.out.println(
                            "=======================================" + "\n" +
                            "1 - Cadastrar Aeromodelo. "+ "\n" +
                            "2 - Cadastrar Hangar. "+ "\n" +
                            "3 - Cadastrar Pista. "+ "\n" +
                            "4 - Cadastrar Voo. "+ "\n" +
                            "5 - Cadastrar Companhia. "+ "\n" +
                            "0 - Voltar. "+ "\n" +
                            "======================================="
                        );
                        
                        try {
                            op = scanner.nextInt();
                        } catch (Exception e) {
                            op = 9;
                        }
                        switch(op) {
                            case 1: {
                                do {
                                    System.out.println(
                                        "=======================================" + "\n" +
                                        "1 - Cadastrar Avião. "+ "\n" +
                                        "2 - Cadastrar Jato. "+ "\n" +
                                        "3 - Cadastrar Helicóptero. "+ "\n" +
                                        "0 - Voltar. "+ "\n" +
                                        "======================================="
                                    );
                                    try {
                                        op = scanner.nextInt();
                                    } catch (Exception e) {
                                        op = 9;
                                    }
                                    switch(op) {
                                        case 1: {
                                            try {
                                               cadastrarAviao();
                                            } catch (Exception e) {
                                               System.out.println("Erro ao cadastrar aeromodelo" + "\n" + "\n" + e.getMessage());
                                               scanner.next();
                                            }
                                            break;
                                        }
                                        case 2: {
                                            try {
                                                cadastrarJato();
                                            } catch (Exception e) {
                                                System.out.println("Erro ao cadastrar aeromodelo" + "\n" + "\n" + e.getMessage());
                                            }
                                            break;
                                        }
                                        case 3: {
                                            try {
                                                cadastrarHelicoptero();
                                            } catch (Exception e) {
                                                System.out.println("Erro ao cadastrar aeromodelo" + "\n" + "\n" + e.getMessage());
                                            }
                                            break;
                                        }
                                        case 0: {
                                            System.out.println("Voltando...");
                                            break;
                                        }
                                        default: {
                                                System.out.println("Opção inválida");
                                                break;
                                            }
                                        }
                                    } while (op != 0);
                                    op = 99;
                                    break;
                                }
                                case 2: {
                                    try {
                                        cadastrarHangar();
                                    } catch (Exception e) {
                                        System.out.println("Erro ao cadastrar hangar" + "\n" + "\n" + e.getMessage());
                                    }
                                    break;
                                }
                                case 3: {
                                    try {
                                        cadastrarPista();
                                    } catch (Exception e) {
                                        System.out.println("Erro ao cadastrar pista" + "\n" + e.getMessage());
                                    }
                                    break;
                                }
                                case 4: {
                                    try {
                                        cadastrarVoo();
                                    } catch (Exception e) {
                                        System.out.println("Erro ao cadastrar voo" + "\n" + e.getMessage());
                                    }
                                    break;
                                }
                                case 5: {
                                    try {
                                        cadastrarCompanhia();
                                    } catch (Exception e) {
                                        System.out.println("Erro ao cadastrar companhia" + "\n" + e.getMessage());
                                    }
                                    break;
                                }
                                case 0: {
                                    System.out.println("Voltando...");
                                    break;
                                }
                                default: {
                                    System.out.println("Opção inválida.");
                                    break;
                                }
                            }
                        } while (op != 0);
                        op = 99;
                    break;
                }
                case 2: {
                    do {
                        System.out.println(
                            "=======================================" + "\n" +
                            "1 - Visualizar Avião. "+ "\n" +
                            "2 - Visualizar Helicóptero. "+ "\n" +
                            "3 - Visualizar Jato. "+ "\n" +
                            "4 - Visualizar Hangar. "+ "\n" +
                            "5 - Visualizar Pista. "+ "\n" +
                            "6 - Visualizar Voo. "+ "\n" +
                            "7 - Visualizar Companhia. "+ "\n" +
                            "0 - Voltar. "+ "\n" +
                            "======================================="
                        );
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
                                    System.out.println("Erro ao listar avião" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 2: {
                                try {
                                    Helicoptero.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar helicóptero" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 3: {
                                try {
                                    Jato.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar jato" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 4: {
                                try {
                                    Hangar.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar hangar" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 5: {
                                try {
                                    Pista.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar pista" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 6: {
                                try {
                                    Voo.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar voo" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 7: {
                                try {
                                    Companhia.select();
                                } catch (Exception e) {
                                    System.out.println("Erro ao listar companhia" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 0: {
                                System.out.println("Voltando...");
                                break;
                            }
                            default: {
                                System.out.println("Opção inválida.");
                                break;
                            }
                        }
                    } while (op != 0);
                    op = 99;
                    break;
                }
                case 3: {
                    do {
                        System.out.println(
                            "=======================================" + "\n" +
                            "1 - Editar Avião. "+ "\n" +
                            "2 - Editar Helicóptero. "+ "\n" +
                            "3 - Editar Jato. "+ "\n" +
                            "4 - Editar Hangar. "+ "\n" +
                            "5 - Editar Pista. "+ "\n" +
                            "6 - Editar Voo. "+ "\n" +
                            "7 - Editar Companhia. "+ "\n" +
                            "0 - Voltar. "+ "\n" +
                            "======================================="
                        );
                        try {
                            op = scanner.nextInt();    
                        } catch (Exception e) {
                            op = 9;
                        }
                        switch(op) {
                            case 1: {
                                try {
                                    editarAviao();
                                } catch (Exception e) {
                                    System.out.println("Erro ao editar avião" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 2: {
                                try {
                                    editarHelicoptero();
                                } catch (Exception e) {
                                    System.out.println("Erro ao editar helicóptero" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 3: {
                                try {
                                    editarJato();
                                } catch (Exception e) {
                                    System.out.println("Erro ao editar jato" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 4: {
                                try {
                                    editarHangar();
                                } catch (Exception e) {
                                    System.out.println("Erro ao editar hangar" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 5: {
                                try {
                                    editarPista();
                                } catch (Exception e) {
                                    System.out.println("Erro ao editar pista" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 6: {
                                try {
                                    editarVoo();
                                } catch (Exception e) {
                                    System.out.println("Erro ao editar voo" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 7: {
                                try {
                                    editarCompanhia();
                                } catch (Exception e) {
                                    System.out.println("Erro ao editar companhia" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 0: {
                                System.out.println("Voltando...");
                                break;
                            }
                            default: {
                                System.out.println("Opção inválida.");
                                break;
                            }
                        }
                    } while (op != 0);
                    op = 99;
                    break;
                }
                case 4: {
                    do {
                        System.out.println(
                            "=======================================" + "\n" +
                            "1 - Excluir Avião. "+ "\n" +
                            "2 - Excluir Helicóptero. "+ "\n" +
                            "3 - Excluir Jato. "+ "\n" +
                            "4 - Excluir Hangar. "+ "\n" +
                            "5 - Excluir Pista. "+ "\n" +
                            "6 - Excluir Voo. "+ "\n" +
                            "7 - Excluir Companhia. "+ "\n" +
                            "0 - Voltar. "+ "\n" +
                            "======================================="
                        );
                        try {
                            op = scanner.nextInt();    
                        } catch (Exception e) {
                            op = 9;
                        }
                        switch(op) {
                            case 1: {
                                try {
                                    System.out.println("Digite o id do avião que deseja excluir: ");
                                    int id = scanner.nextInt();
                                    Aviao.delete(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir avião" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 2: {
                                try {
                                    System.out.println("Digite o id do helicóptero que deseja excluir: ");
                                    int id = scanner.nextInt();
                                    Helicoptero.delete(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir helicóptero" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 3: {
                                try {
                                    System.out.println("Digite o id do jato que deseja excluir: ");
                                    int id = scanner.nextInt();
                                    Jato.delete(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir jato" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 4: {
                                try {
                                    System.out.println("Digite o id do hangar que deseja excluir: ");
                                    int id = scanner.nextInt();
                                    Hangar.delete(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir hangar" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 5: {
                                try {
                                    System.out.println("Digite o id da pista que deseja excluir: ");
                                    int id = scanner.nextInt();
                                    Pista.delete(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir pista" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 6: {
                                try {
                                    System.out.println("Digite o id do voo que deseja excluir: ");
                                    int id = scanner.nextInt();
                                    Voo.delete(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir voo" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 7: {
                                try {
                                    System.out.println("Digite o id da companhia que deseja excluir: ");
                                    int id = scanner.nextInt();
                                    Companhia.delete(id);
                                } catch (Exception e) {
                                    System.out.println("Erro ao excluir companhia" + "\n" + e.getMessage());
                                }
                                break;
                            }
                            case 0: {
                                System.out.println("Voltando...");
                                break;
                            }
                            default: {
                                System.out.println("Opção inválida.");
                                break;
                            }
                        }
                    } while (op != 0);
                    op = 99;
                    break;
                }
                case 0: {
                    System.out.println("Saindo...");
                    break;
                }
                default: {
                    System.out.println("Opção inválida.");
                    break;
                }
            }
        } while (op != 0);
        scanner.close();
    }

    public static void cadastrarAviao() throws Exception {
        System.out.println("Digite a marca: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo: ");
        String modelo = scanner.next();
        String prefixoL = "";
        int prefixoN = 0;
        String conc = "";
        while(conc.length() != 7) {
            System.out.println("Digite as três(3) letras do prefixo: ");
            prefixoL = scanner.next();
            System.out.println("Digite os quatro(4) números do prefixo: ");
            prefixoN = scanner.nextInt();
            conc = prefixoL + Integer.toString(prefixoN);
        }
        System.out.println("Digite a capacidade: ");
        int capacidade = scanner.nextInt();
        while(capacidade <= 0) {
            System.out.println("Você digitou uma capacidade nula ou negativa, digite novamente: ");
            capacidade = scanner.nextInt();
        }
        System.out.println("Digite o id da companhia: ");
        int idCompanhia = scanner.nextInt();

        new Aviao(marca, modelo, prefixoL, prefixoN, capacidade, Companhia.getById(idCompanhia), idCompanhia);
    }

    public static void cadastrarJato() throws Exception{
        System.out.println("Digite a marca: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo: ");
        String modelo = scanner.next();
        System.out.println("Digite a cor: ");
        String cor = scanner.next();
        System.out.println("Digite a velocidade: ");
        int velocidade = scanner.nextInt();
        while(velocidade <= 0) {
            System.out.println("Você digitou uma velocidade nula ou negativa, digite novamente: ");
            velocidade = scanner.nextInt();
        }

        new Jato(marca, modelo, cor, velocidade);
    }

    public static void cadastrarHelicoptero() throws Exception{
        System.out.println("Digite a marca: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo: ");
        String modelo = scanner.next();
        System.out.println("Digite a cor: ");
        String cor = scanner.next();
        System.out.println("Digite a capacidade: ");
        int capacidade = scanner.nextInt();
        while(capacidade <= 0) {
            System.out.println("Você digitou uma capacidade nula ou negativa, digite novamente: ");
            capacidade = scanner.nextInt();
        }

        new Helicoptero(marca, modelo, cor, capacidade);
    }

    public static void cadastrarHangar() throws Exception{
        System.out.println("Digite o local: ");
        String local = scanner.next();
        System.out.println("Digite o id do avião: ");
        int idAviao = scanner.nextInt();
        
        new Hangar(local, idAviao, Aviao.getById(idAviao));
    }

    public static void cadastrarPista() throws Exception{

        char numeroL = ' ';
        int numeroN = 0;
        String conc = "";
        while(conc.length() != 3) {
            System.out.println("Digite uma(1) letra da numeração: ");
            numeroL = scanner.next().charAt(0);
            System.out.println("Digite os dois(dois) números da numeração: ");
            numeroN = scanner.nextInt();
            conc = numeroL + Integer.toString(numeroN);
        }
        
        new Pista(numeroL, numeroN);
    }

    public static void cadastrarVoo() throws Exception{
        String numeroL = "";
        int numeroN = 0;
        String conc = "";
        while(conc.length() != 7) {
            System.out.println("Digite as três(3) letras da numeração: ");
            numeroL = scanner.next();
            System.out.println("Digite os seis(6) números da numeração: ");
            numeroN = scanner.nextInt();
            conc = numeroL + Integer.toString(numeroN);
        }
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
        System.out.println("1 - Avião." + "\n" + 
            "2 - Jato." + "\n" + 
            "3 - Helicóptero." + "\n" +
            "Digite qual tipo de aeronave deseja cadastrar: ");
        int tipo = scanner.nextInt();
        System.out.println("Digite o id do aeromodelo: ");
        int idAeromodelo = scanner.nextInt();
        while(tipo < 1 || tipo > 3) {
            System.out.println("1 - Avião." + "\n" + 
            "2 - Jato." + "\n" + 
            "3 - Helicóptero." + "\n" +
            "Opção inválida, digite novamente: ");
            tipo = scanner.nextInt();
            System.out.println("Digite o id do aeromodelo: ");
            idAeromodelo = scanner.nextInt();
        }

        new Voo(numeroL, numeroN, data, hora, origem, destino, piloto, copiloto, observacao, idPista, Pista.getById(idAeromodelo), tipo, Aeromodelo.getById(idAeromodelo), idAeromodelo);
           

        
    }

    public static void cadastrarCompanhia() throws Exception{
        System.out.println("Digite o nome: ");
        String nome = scanner.next();
        System.out.println("Digite o CNPJ: ");
        String cnpj = scanner.next();
        
        new Companhia(nome, cnpj);
    }

    public static void editarAviao() throws Exception{
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

        Aviao.update(id, marca, modelo, prefixo, capacidade, Companhia.getById(idCompanhia), idCompanhia);
    }

    public static void editarJato() throws Exception{
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

        Jato.update(id, marca, modelo, cor, velocidade);
    }

    public static void editarHelicoptero() throws Exception{
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

        Helicoptero.update(id, marca, modelo, cor, capacidade);
    }

    public static void editarHangar() throws Exception{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o local: ");
        String local = scanner.next();
        System.out.println("Digite o id do avião: ");
        int idAviao = scanner.nextInt();

        Hangar.update(id, local, idAviao, Aviao.getById(idAviao));
    }

    public static void editarPista() throws Exception{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o número: ");
        String numero = scanner.next();
        
        Pista.update(id, numero);
    }

    public static void editarVoo() throws Exception{
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

        Voo.update(id, numero, data, hora, origem, destino, piloto, copiloto, observacao, idPista, Pista.getById(idPista), idHelicoptero, Helicoptero.getById(idHelicoptero), idJato, Jato.getById(idJato), idAviao, Aviao.getById(idAviao));
    }

    public static void editarCompanhia() throws Exception{
        System.out.println("Digite o id: ");
        int id = scanner.nextInt();
        System.out.println("Digite o nome: ");
        String nome = scanner.next();
        System.out.println("Digite o CNPJ: ");
        String cnpj = scanner.next();
        
        Companhia.update(id, nome, cnpj);
    }

    public static Scanner scanner = new Scanner(System.in);

    public static int op;
}
