class Produto {
    String nome;
    double preco;
  
    public Produto(String nome, double preco) {
      this.nome = nome;
      this.preco = preco;
    }
  }
  
  class Livro extends Produto {
    // Atributos específicos de livros
    public Livro(String nome, double preco) {
      super(nome, preco);
      // Inicialização de atributos de livros
    }
  }
  
  class Eletronico extends Produto {
    // Atributos específicos de eletrônicos
    public Eletronico(String nome, double preco) {
      super(nome, preco);
      // Inicialização de atributos de eletrônicos
    }
  }
  
  class Roupa extends Produto {
    // Atributos específicos de roupas
    public Roupa(String nome, double preco) {
      super(nome, preco);
      // Inicialização de atributos de roupas
    }
  }
  
  class CarrinhoCompras {
    List<Produto> produtos;
  
    public CarrinhoCompras() {
      this.produtos = new ArrayList<>();
    }
  
    public void adicionarProduto(Produto produto) {
      produtos.add(produto);
    }
  
    public double calcularValorTotal() {
      double total = 0;
      for (Produto produto : produtos) {
        if (produto instanceof Livro) {
          // Lógica de cálculo específica para livros
        } else if (produto instanceof Eletronico) {
          // Lógica de cálculo específica para eletrônicos
        } else if (produto instanceof Roupa) {
          // Lógica de cálculo específica para roupas
        }
      }
      return total;
    }
  }