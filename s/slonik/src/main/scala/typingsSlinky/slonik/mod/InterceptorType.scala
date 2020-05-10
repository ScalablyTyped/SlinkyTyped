package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterceptorType extends js.Object {
  var afterPoolConnection: js.UndefOr[
    js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[Null]
    ]
  ] = js.native
  var afterQueryExecution: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* result */ QueryResultType[QueryResultRowType[String]], 
      MaybePromiseType[Null]
    ]
  ] = js.native
  var beforePoolConnection: js.UndefOr[
    js.Function1[
      /* connectionContext */ PoolContextType, 
      MaybePromiseType[js.UndefOr[DatabasePoolType | Null]]
    ]
  ] = js.native
  var beforePoolConnectionRelease: js.UndefOr[
    js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[Null]
    ]
  ] = js.native
  var beforeQueryExecution: js.UndefOr[
    js.Function2[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      MaybePromiseType[QueryResultType[QueryResultRowType[String]] | Null]
    ]
  ] = js.native
  var beforeQueryResult: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* result */ QueryResultType[QueryResultRowType[String]], 
      MaybePromiseType[Null]
    ]
  ] = js.native
  var beforeTransformQuery: js.UndefOr[
    js.Function2[/* queryContext */ QueryContextType, /* query */ QueryType, MaybePromiseType[Null]]
  ] = js.native
  var queryExecutionError: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* error */ SlonikError, 
      MaybePromiseType[Null]
    ]
  ] = js.native
  var transformQuery: js.UndefOr[
    js.Function2[/* queryContext */ QueryContextType, /* query */ QueryType, QueryType]
  ] = js.native
  var transformRow: js.UndefOr[
    js.Function4[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* row */ QueryResultRowType[String], 
      /* fields */ js.Array[FieldType], 
      QueryResultRowType[String]
    ]
  ] = js.native
}

object InterceptorType {
  @scala.inline
  def apply(): InterceptorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterceptorType]
  }
  @scala.inline
  implicit class InterceptorTypeOps[Self <: InterceptorType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterPoolConnection(
      value: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => MaybePromiseType[Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPoolConnection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterPoolConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPoolConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterQueryExecution(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* result */ QueryResultType[QueryResultRowType[String]]) => MaybePromiseType[Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterQueryExecution")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterQueryExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterQueryExecution")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePoolConnection(
      value: /* connectionContext */ PoolContextType => MaybePromiseType[js.UndefOr[DatabasePoolType | Null]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePoolConnection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforePoolConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePoolConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePoolConnectionRelease(
      value: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => MaybePromiseType[Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePoolConnectionRelease")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforePoolConnectionRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePoolConnectionRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeQueryExecution(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType) => MaybePromiseType[QueryResultType[QueryResultRowType[String]] | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeQueryExecution")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeQueryExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeQueryExecution")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeQueryResult(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* result */ QueryResultType[QueryResultRowType[String]]) => MaybePromiseType[Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeQueryResult")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeQueryResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeQueryResult")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeTransformQuery(value: (/* queryContext */ QueryContextType, /* query */ QueryType) => MaybePromiseType[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTransformQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeTransformQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTransformQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryExecutionError(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* error */ SlonikError) => MaybePromiseType[Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryExecutionError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutQueryExecutionError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryExecutionError")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformQuery(value: (/* queryContext */ QueryContextType, /* query */ QueryType) => QueryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransformQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformRow(
      value: (/* queryContext */ QueryContextType, /* query */ QueryType, /* row */ QueryResultRowType[String], /* fields */ js.Array[FieldType]) => QueryResultRowType[String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRow")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutTransformRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRow")(js.undefined)
        ret
    }
  }
  
}

