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
  type IdentifierNormalizerType = js.Function1[/* identifierName */ java.lang.String, java.lang.String]
  type LoggerType = js.Function1[/* repeated */ java.lang.String, scala.Nothing]
  type NamedAssignmentType = typingsSlinky.std.Record[java.lang.String, typingsSlinky.slonik.mod.ValueExpressionType]
  type NamedParameterValuesType = typingsSlinky.std.Record[java.lang.String, typingsSlinky.slonik.mod.ValueExpressionType]
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
  type QueryResultRowType[ColumnName /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in ColumnName ]: slonik.slonik.QueryResultRowColumnType}
    */ typingsSlinky.slonik.slonikStrings.QueryResultRowType with org.scalablytyped.runtime.TopLevel[js.Any]
  type SqlSqlTokenType[T] = typingsSlinky.slonik.mod.TaggedTemplateLiteralInvocationType[T]
  type StreamHandlerType = js.Function1[/* stream */ typingsSlinky.node.streamMod.Readable, scala.Unit]
  type TransactionFunctionType[T] = js.Function1[
    /* connection */ typingsSlinky.slonik.mod.DatabaseTransactionConnectionType, 
    js.Promise[T]
  ]
}
