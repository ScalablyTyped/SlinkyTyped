package typingsSlinky.slonik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClientConfigurationInputType = typingsSlinky.slonik.mod.ClientConfigurationType
  type ConnectionRoutineType[T] = js.Function1[
    /* connection */ typingsSlinky.slonik.mod.DatabasePoolConnectionType, 
    js.Promise[T]
  ]
  type DatabaseConfigurationType = java.lang.String | typingsSlinky.slonik.AnonDatabase
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
    */ typingsSlinky.slonik.slonikStrings.QueryResultRowType with js.Any
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
}
