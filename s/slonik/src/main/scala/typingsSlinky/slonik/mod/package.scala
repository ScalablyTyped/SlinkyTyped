package typingsSlinky.slonik

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ClientConfigurationInputType = typingsSlinky.slonik.mod.ClientConfigurationType
  
  type ConnectionRoutineType[T] = js.Function1[
    /* connection */ typingsSlinky.slonik.mod.DatabasePoolConnectionType, 
    js.Promise[T]
  ]
  
  type IdentifierNormalizerType = js.Function1[/* identifierName */ java.lang.String, java.lang.String]
  
  type LoggerType = js.Function1[/* repeated */ java.lang.String, scala.Nothing]
  
  type MaybePromiseType[T] = T | js.Promise[T]
  
  type NamedAssignmentType = typingsSlinky.std.Record[java.lang.String, typingsSlinky.slonik.mod.ValueExpressionType]
  
  type NamedParameterValuesType = typingsSlinky.std.Record[java.lang.String, typingsSlinky.slonik.mod.ValueExpressionType]
  
  type PrimitiveValueExpressionType = java.lang.String | scala.Double | scala.Boolean | scala.Null | typingsSlinky.slonik.mod.PrimitiveValueExpressionTypeArray
  
  type QueryAnyFirstFunctionType = js.Function1[
    /* args */ typingsSlinky.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ]
  ]
  
  type QueryAnyFunctionType = js.Function1[
    /* args */ typingsSlinky.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[js.Array[js.Any]]
  ]
  
  type QueryExistsFunctionType = js.Function1[
    /* args */ typingsSlinky.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[scala.Boolean]
  ]
  
  type QueryFunctionType = js.Function1[
    /* args */ typingsSlinky.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[typingsSlinky.slonik.mod.QueryResultType[js.Any]]
  ]
  
  type QueryIdType = java.lang.String
  
  type QueryManyFirstFunctionType = typingsSlinky.slonik.mod.QueryAnyFirstFunctionType
  
  type QueryManyFunctionType = typingsSlinky.slonik.mod.QueryAnyFunctionType
  
  type QueryMaybeOneFirstFunctionType = js.Function1[
    /* args */ typingsSlinky.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | scala.Null
    ]
  ]
  
  type QueryMaybeOneFunctionType = js.Function1[
    /* args */ typingsSlinky.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[js.Any | scala.Null]
  ]
  
  type QueryMethodParams[T] = typingsSlinky.std.Parameters[typingsSlinky.slonik.mod.QueryMethodType[T, scala.Nothing]]
  
  type QueryMethodType[RowType, Result] = js.Function2[
    /* sql */ typingsSlinky.slonik.mod.TaggedTemplateLiteralInvocationType[RowType], 
    /* values */ js.UndefOr[js.Array[typingsSlinky.slonik.mod.PrimitiveValueExpressionType]], 
    js.Promise[Result]
  ]
  
  type QueryOneFirstFunctionType = js.Function1[
    /* args */ typingsSlinky.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]
  
  type QueryOneFunctionType = js.Function1[/* args */ typingsSlinky.slonik.mod.QueryMethodParams[js.Any], js.Promise[js.Any]]
  
  type QueryResultRowColumnType = java.lang.String | scala.Double
  
  type QueryResultRowType[ColumnName /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in ColumnName ]: slonik.slonik.QueryResultRowColumnType}
    */ typingsSlinky.slonik.slonikStrings.QueryResultRowType with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - js.Object
    - typingsSlinky.slonik.mod.SerializableValueObject
    - typingsSlinky.slonik.mod.SerializableValueArray
  */
  type SerializableValueType = typingsSlinky.slonik.mod._SerializableValueType | java.lang.String | scala.Double | scala.Boolean | scala.Null | js.Object
  
  type SqlSqlTokenType[T] = typingsSlinky.slonik.mod.TaggedTemplateLiteralInvocationType[T]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.slonik.mod.ArraySqlTokenType
    - typingsSlinky.slonik.mod.BinarySqlTokenType
    - typingsSlinky.slonik.mod.IdentifierSqlTokenType
    - typingsSlinky.slonik.mod.JsonSqlTokenType
    - typingsSlinky.slonik.mod.ListSqlTokenType
    - typingsSlinky.slonik.mod.SqlSqlTokenType[js.Any]
    - typingsSlinky.slonik.mod.UnnestSqlTokenType
  */
  type SqlTokenType = typingsSlinky.slonik.mod._SqlTokenType | typingsSlinky.slonik.mod.SqlSqlTokenType[js.Any]
  
  type StreamHandlerType = js.Function1[/* stream */ typingsSlinky.node.streamMod.Readable, scala.Unit]
  
  type TransactionFunctionType[T] = js.Function1[
    /* connection */ typingsSlinky.slonik.mod.DatabaseTransactionConnectionType, 
    js.Promise[T]
  ]
  
  type ValueExpressionType = typingsSlinky.slonik.mod.SqlTokenType | typingsSlinky.slonik.mod.PrimitiveValueExpressionType
  
  @scala.inline
  def createBenchmarkingInterceptor(): typingsSlinky.slonik.mod.InterceptorType = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBenchmarkingInterceptor")().asInstanceOf[typingsSlinky.slonik.mod.InterceptorType]
  
  @scala.inline
  def createBigintTypeParser(): typingsSlinky.slonik.mod.TypeParserType[scala.Double] = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBigintTypeParser")().asInstanceOf[typingsSlinky.slonik.mod.TypeParserType[scala.Double]]
  
  @scala.inline
  def createFieldNameTransformationInterceptor(configuration: typingsSlinky.slonik.anon.Format): typingsSlinky.slonik.mod.InterceptorType = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFieldNameTransformationInterceptor")(configuration.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.slonik.mod.InterceptorType]
  
  @scala.inline
  def createInterceptorPreset(): js.Array[typingsSlinky.slonik.mod.InterceptorType] = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptorPreset")().asInstanceOf[js.Array[typingsSlinky.slonik.mod.InterceptorType]]
  
  @scala.inline
  def createPool(connectionUri: java.lang.String): typingsSlinky.slonik.mod.DatabasePoolType = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.slonik.mod.DatabasePoolType]
  @scala.inline
  def createPool(
    connectionUri: java.lang.String,
    clientUserConfiguration: typingsSlinky.slonik.mod.ClientConfigurationInputType
  ): typingsSlinky.slonik.mod.DatabasePoolType = (typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(connectionUri.asInstanceOf[js.Any], clientUserConfiguration.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.slonik.mod.DatabasePoolType]
  
  @scala.inline
  def createQueryNormalizationInterceptor(): typingsSlinky.slonik.mod.InterceptorType = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueryNormalizationInterceptor")().asInstanceOf[typingsSlinky.slonik.mod.InterceptorType]
  @scala.inline
  def createQueryNormalizationInterceptor(configuration: typingsSlinky.slonik.anon.StripComments): typingsSlinky.slonik.mod.InterceptorType = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueryNormalizationInterceptor")(configuration.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.slonik.mod.InterceptorType]
  
  @scala.inline
  def createSqlTag(): typingsSlinky.slonik.mod.SqlTaggedTemplateType = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlTag")().asInstanceOf[typingsSlinky.slonik.mod.SqlTaggedTemplateType]
  @scala.inline
  def createSqlTag(configuration: typingsSlinky.slonik.mod.SqlTagConfigurationType): typingsSlinky.slonik.mod.SqlTaggedTemplateType = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlTag")(configuration.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.slonik.mod.SqlTaggedTemplateType]
  
  @scala.inline
  def createTimestampTypeParser(): typingsSlinky.slonik.mod.TypeParserType[scala.Double | scala.Null] = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTimestampTypeParser")().asInstanceOf[typingsSlinky.slonik.mod.TypeParserType[scala.Double | scala.Null]]
  
  @scala.inline
  def createTimestampWithTimeZoneTypeParser(): typingsSlinky.slonik.mod.TypeParserType[scala.Double | scala.Null] = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTimestampWithTimeZoneTypeParser")().asInstanceOf[typingsSlinky.slonik.mod.TypeParserType[scala.Double | scala.Null]]
  
  @scala.inline
  def createTypeParserPreset(): js.Array[typingsSlinky.slonik.mod.TypeParserType[_]] = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTypeParserPreset")().asInstanceOf[js.Array[typingsSlinky.slonik.mod.TypeParserType[_]]]
  
  @scala.inline
  def sql: typingsSlinky.slonik.mod.SqlTaggedTemplateType = typingsSlinky.slonik.mod.^.asInstanceOf[js.Dynamic].selectDynamic("sql").asInstanceOf[typingsSlinky.slonik.mod.SqlTaggedTemplateType]
}
