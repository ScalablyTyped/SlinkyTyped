package typingsSlinky.typedGraphql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def GraphQLBoolean: typingsSlinky.typedGraphql.mod.GraphQLScalarType = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLBoolean").asInstanceOf[typingsSlinky.typedGraphql.mod.GraphQLScalarType]
  @scala.inline
  def GraphQLBoolean_=(x: typingsSlinky.typedGraphql.mod.GraphQLScalarType): scala.Unit = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLBoolean")(x.asInstanceOf[js.Any])
  
  type GraphQLEnumValueConfigMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.typedGraphql.mod.GraphQLEnumValueConfig]
  
  // error/*.js
  type GraphQLError = js.Error
  
  type GraphQLFieldConfigArgumentMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.typedGraphql.mod.GraphQLArgumentConfig]
  
  type GraphQLFieldConfigMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.typedGraphql.mod.GraphQLFieldConfig]
  
  type GraphQLFieldConfigMapThunk = js.Function0[typingsSlinky.typedGraphql.mod.GraphQLFieldConfigMap]
  
  type GraphQLFieldDefinitionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.typedGraphql.mod.GraphQLFieldDefinition]
  
  type GraphQLFieldResolveFn = js.Function4[
    /* source */ js.Any, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* context */ js.Any, 
    /* info */ typingsSlinky.typedGraphql.mod.GraphQLResolveInfo, 
    js.Any
  ]
  
  @scala.inline
  def GraphQLFloat: typingsSlinky.typedGraphql.mod.GraphQLScalarType = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLFloat").asInstanceOf[typingsSlinky.typedGraphql.mod.GraphQLScalarType]
  @scala.inline
  def GraphQLFloat_=(x: typingsSlinky.typedGraphql.mod.GraphQLScalarType): scala.Unit = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLFloat")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def GraphQLID: typingsSlinky.typedGraphql.mod.GraphQLScalarType = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLID").asInstanceOf[typingsSlinky.typedGraphql.mod.GraphQLScalarType]
  @scala.inline
  def GraphQLID_=(x: typingsSlinky.typedGraphql.mod.GraphQLScalarType): scala.Unit = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLID")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def GraphQLIncludeDirective: typingsSlinky.typedGraphql.mod.GraphQLDirective = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLIncludeDirective").asInstanceOf[typingsSlinky.typedGraphql.mod.GraphQLDirective]
  @scala.inline
  def GraphQLIncludeDirective_=(x: typingsSlinky.typedGraphql.mod.GraphQLDirective): scala.Unit = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLIncludeDirective")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def GraphQLInt: typingsSlinky.typedGraphql.mod.GraphQLScalarType = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLInt").asInstanceOf[typingsSlinky.typedGraphql.mod.GraphQLScalarType]
  @scala.inline
  def GraphQLInt_=(x: typingsSlinky.typedGraphql.mod.GraphQLScalarType): scala.Unit = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLInt")(x.asInstanceOf[js.Any])
  
  type GraphQLInterfacesThunk = js.Function0[js.Array[typingsSlinky.typedGraphql.mod.GraphQLInterfaceType]]
  
  type GraphQLIsTypeOfFn = js.Function3[
    /* source */ js.Any, 
    /* context */ js.Any, 
    /* info */ typingsSlinky.typedGraphql.mod.GraphQLResolveInfo, 
    scala.Boolean
  ]
  
  @scala.inline
  def GraphQLSkipDirective: typingsSlinky.typedGraphql.mod.GraphQLDirective = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLSkipDirective").asInstanceOf[typingsSlinky.typedGraphql.mod.GraphQLDirective]
  @scala.inline
  def GraphQLSkipDirective_=(x: typingsSlinky.typedGraphql.mod.GraphQLDirective): scala.Unit = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLSkipDirective")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def GraphQLString: typingsSlinky.typedGraphql.mod.GraphQLScalarType = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLString").asInstanceOf[typingsSlinky.typedGraphql.mod.GraphQLScalarType]
  @scala.inline
  def GraphQLString_=(x: typingsSlinky.typedGraphql.mod.GraphQLScalarType): scala.Unit = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLString")(x.asInstanceOf[js.Any])
  
  type GraphQLTypeResolveFn = js.Function3[
    /* value */ js.Any, 
    /* context */ js.Any, 
    /* info */ typingsSlinky.typedGraphql.mod.GraphQLResolveInfo, 
    typingsSlinky.typedGraphql.mod.GraphQLObjectType
  ]
  
  type InputObjectConfigFieldMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.typedGraphql.mod.InputObjectFieldConfig]
  
  type InputObjectConfigFieldMapThunk = js.Function0[typingsSlinky.typedGraphql.mod.InputObjectConfigFieldMap]
  
  type InputObjectFieldMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.typedGraphql.mod.InputObjectField]
  
  type Lexer = js.Function1[/* resetPosition */ js.UndefOr[scala.Double], typingsSlinky.typedGraphql.mod.Token]
  
  type TokenKind = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  type TypeKind = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type TypeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.typedGraphql.mod.GraphQLType]
  
  // validation/*.js
  type ValidationRule = js.Function1[/* context */ typingsSlinky.typedGraphql.mod.ValidationContext, js.Any]
  
  @scala.inline
  def buildClientSchema(introspection: typingsSlinky.typedGraphql.mod.IntrospectionQuery_): typingsSlinky.typedGraphql.mod.GraphQLSchema = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildClientSchema")(introspection.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.typedGraphql.mod.GraphQLSchema]
  
  @scala.inline
  def formatError(error: js.Error): typingsSlinky.typedGraphql.mod.GraphQLFormattedError = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.typedGraphql.mod.GraphQLFormattedError]
  
  @scala.inline
  def graphql(schema: typingsSlinky.typedGraphql.mod.GraphQLSchema, requestString: java.lang.String): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: js.UndefOr[scala.Nothing],
    operationName: java.lang.String
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: java.lang.String
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.Any
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.Any,
    variableValues: js.UndefOr[scala.Nothing],
    operationName: java.lang.String
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: java.lang.String
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: js.UndefOr[scala.Nothing],
    operationName: java.lang.String
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: java.lang.String
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: js.UndefOr[scala.Nothing],
    operationName: java.lang.String
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: java.lang.String
  ): js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.typedGraphql.mod.GraphQLResult]]
  
  @scala.inline
  def introspectionQuery: java.lang.String = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("introspectionQuery").asInstanceOf[java.lang.String]
  
  @scala.inline
  def specifiedRules: js.Array[typingsSlinky.typedGraphql.mod.ValidationRule] = typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("specifiedRules").asInstanceOf[js.Array[typingsSlinky.typedGraphql.mod.ValidationRule]]
  
  @scala.inline
  def validate(schema: typingsSlinky.typedGraphql.mod.GraphQLSchema, ast: typingsSlinky.typedGraphql.mod.Document): js.Array[js.Error] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], ast.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Error]]
  @scala.inline
  def validate(
    schema: typingsSlinky.typedGraphql.mod.GraphQLSchema,
    ast: typingsSlinky.typedGraphql.mod.Document,
    rules: js.Array[_]
  ): js.Array[js.Error] = (typingsSlinky.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], ast.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Error]]
}
