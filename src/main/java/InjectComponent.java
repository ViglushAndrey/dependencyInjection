import dagger.Component;

@Component(modules = InjectModule.class)
public interface InjectComponent {

    Computer buildComputer();

}
