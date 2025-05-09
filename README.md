# Abstract Factory Pattern – Java Example

Este projeto demonstra a aplicação do **padrão de projeto Abstract Factory** em Java, usando um exemplo didático com interfaces gráficas (GUI) para diferentes sistemas operacionais.

## 🧱 Padrão Abstract Factory

O padrão **Abstract Factory** é um padrão de criação que fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas. Ele é útil para manter a consistência entre produtos que pertencem à mesma família, como componentes de UI de um mesmo sistema operacional.

## 📁 Estrutura do Projeto

```

src/
└── abstractfactory/
├── app/               # Cliente que usa a fábrica abstrata
├── factories/         # Fábricas concretas (Windows e Mac)
├── interfaces/        # Fábrica abstrata e interfaces dos produtos
└── products/          # Implementações concretas dos produtos (Botão, Caixa de Texto)

````

### Principais componentes:

- **GUIFactory**: Interface da fábrica abstrata
- **Button / TextBox**: Interfaces dos produtos
- **WindowsFactory / MacFactory**: Fábricas concretas
- **WindowsButton / MacButton**: Implementações concretas dos produtos
- **Application**: Classe cliente que utiliza os produtos sem conhecer suas implementações

## 🚀 Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/ArturShift/AbstractFactory.git
   cd AbstractFactory
    ```

2. Compile os arquivos Java:

   ```bash
   javac -d out src/abstractfactory/**/*.java
   ```

3. Execute a aplicação:

   ```bash
   java -cp out abstractfactory.app.Demo
   ```

   Ao executar, você poderá escolher entre `Windows` ou `Mac` para simular a criação de interfaces específicas.

## 📚 Aprendizado

Este projeto é ideal para quem deseja:

* Compreender o funcionamento do padrão Abstract Factory na prática.
* Aprender como aplicar princípios de design orientado a objetos.
* Praticar a criação de projetos organizados com pacotes e interfaces.

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
