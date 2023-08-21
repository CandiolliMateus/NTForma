package src.Enumeracoes.classes;

public enum TipoCliente {

    // NO "enum" É POSSÍVEL CRIAR ATRIBUTOS E MÉTODOS
    // MAS AS CONTANSTES DEVEM SER AS PRIMEIRAS A SEREM ESCRITAS
    PESSOA_FISICA (1, "Pessoa Física"),
    PESSOA_PUBLICA(3, "Pessoa Pública") {
        // CONCEITO: constant specific class body
        // É UTILIZADO QUANDO SE DEFINE UMA RESPOSTA ESPECÍFICA PARA UMA DAS CONTANTES DO enum
        public String getId() {
            return "Pessoa Pública";
        }
    },
    PESSOA_JURIDICA (2, "Pessoa Jurídica") {
        // CONCEITO: constant specific class body
        public String getId() {
            return "M";
        }
    };

    private int tipo;
    private String descricao;

    TipoCliente(int tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    // CONCEITO: constant specific class body
    public String getId() {
        return "A";
    }

    public int getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }
}
