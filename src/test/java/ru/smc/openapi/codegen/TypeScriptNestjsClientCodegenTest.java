package ru.smc.openapi.codegen;

import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.parser.core.models.ParseOptions;
import org.junit.Test;

/***
 * This test allows you to easily launch your code generation software under a debugger.
 * Then run this test under debug mode.  You will be able to step through your java code
 * and then see the results in the out directory.
 *
 * To experiment with debugging your code generator:
 * 1) Set a break point in TypeScriptNestjsClientCodegen.java in the postProcessOperationsWithModels() method.
 * 2) To launch this test in Eclipse: right-click | Debug As | JUnit Test
 *
 */
public class TypeScriptNestjsClientCodegenTest {

  // use this test to launch you code generator in the debugger.
  // this allows you to easily set break points in MyclientcodegenGenerator.
  @Test
  public void launchCodeGenerator() {
    // to understand how the 'openapi-generator-cli' module is using 'CodegenConfigurator', have a look at the 'Generate' class:
    // https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-cli/src/main/java/org/openapitools/codegen/cmd/Generate.java
    //    final CodegenConfigurator configurator = new CodegenConfigurator()
    //              .setGeneratorName("default") // use this codegen library
    //              .setInputSpec("spec/openapi-simple-example.yaml") // sample OpenAPI file
    //              // .setInputSpec("https://raw.githubusercontent.com/openapitools/openapi-generator/master/modules/openapi-generator/src/test/resources/2_0/petstore.yaml") // or from the server
    //              .setOutputDir("out/default"); // output directory
    //
    //    final ClientOptInput clientOptInput = configurator.toClientOptInput();
    TypeScriptNestjsClientCodegen generator = new TypeScriptNestjsClientCodegen();
    generator.processOpts();
    generator.preprocessOpenAPI(new OpenAPIParser().readLocation("src/test/resources/spec/openapi-simple-example.yaml", null, new ParseOptions()).getOpenAPI());
  }
}