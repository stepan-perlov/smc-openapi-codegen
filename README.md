# Shared Model Concept - OpenAPI Generator

This project implement custom logic for [openapi-generator-cli](https://github.com/OpenAPITools/openapi-generator).

Information about this custom logic:
 - [Customization](https://github.com/OpenAPITools/openapi-generator/blob/master/docs/customization.md)
 - [Templating](https://github.com/OpenAPITools/openapi-generator/blob/master/docs/templating.md)

## Setup java package

Open project in IntelliJ IDEA and install maven dependencies.

## Create package with custom generator

```bash
mvn package
```

Custom generator builder into target/smc-openapi-codegen-1.0.0.jar.

## Run generate command with custom generator and templates

```bash
npm run codegen:simple
```

For more details of custom generator params read package.json:scripts.
