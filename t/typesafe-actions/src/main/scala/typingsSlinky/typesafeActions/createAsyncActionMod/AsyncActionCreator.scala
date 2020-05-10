package typingsSlinky.typesafeActions.createAsyncActionMod

import typingsSlinky.typesafeActions.typeHelpersMod.ActionBuilderConstructor
import typingsSlinky.typesafeActions.typeHelpersMod.EmptyAction
import typingsSlinky.typesafeActions.typeHelpersMod.PayloadAction
import typingsSlinky.typesafeActions.typeHelpersMod.PayloadMetaAction
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncActionCreator[TRequest /* <: js.Tuple2[T1, P1] */, TSuccess /* <: js.Tuple2[T2, P2] */, TFailure /* <: js.Tuple2[T3, P3] */, TCancel /* <: js.Tuple2[T4, P4] */, T1 /* <: TypeConstant */, P1, T2 /* <: TypeConstant */, P2, T3 /* <: TypeConstant */, P3, T4 /* <: TypeConstant */, P4] extends js.Object {
  var cancel: ActionBuilderConstructor[T4, P4, js.UndefOr[scala.Nothing]] = js.native
  var failure: ActionBuilderConstructor[T3, P3, js.UndefOr[scala.Nothing]] = js.native
  var request: ActionBuilderConstructor[T1, P1, js.UndefOr[scala.Nothing]] = js.native
  var success: ActionBuilderConstructor[T2, P2, js.UndefOr[scala.Nothing]] = js.native
}

object AsyncActionCreator {
  @scala.inline
  def apply[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4](
    cancel: ActionBuilderConstructor[T4, P4, js.UndefOr[scala.Nothing]],
    failure: ActionBuilderConstructor[T3, P3, js.UndefOr[scala.Nothing]],
    request: ActionBuilderConstructor[T1, P1, js.UndefOr[scala.Nothing]],
    success: ActionBuilderConstructor[T2, P2, js.UndefOr[scala.Nothing]]
  ): AsyncActionCreator[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncActionCreator[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4]]
  }
  @scala.inline
  implicit class AsyncActionCreatorOps[Self[trequest, tsuccess, tfailure, tcancel, t1, p1, t2, p2, t3, p3, t4, p4] <: AsyncActionCreator[trequest, tsuccess, tfailure, tcancel, t1, p1, t2, p2, t3, p3, t4, p4], TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] (val x: Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4]) with Other]
    @scala.inline
    def withCancelFunction2(value: (P4, js.UndefOr[scala.Nothing]) => PayloadMetaAction[T4, P4, js.UndefOr[scala.Nothing]]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCancelFunction1(value: P4 => PayloadAction[T4, P4]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancelFunction0(value: () => EmptyAction[T4]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCancel(value: ActionBuilderConstructor[T4, P4, js.UndefOr[scala.Nothing]]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureFunction2(value: (P3, js.UndefOr[scala.Nothing]) => PayloadMetaAction[T3, P3, js.UndefOr[scala.Nothing]]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFailureFunction1(value: P3 => PayloadAction[T3, P3]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFailureFunction0(value: () => EmptyAction[T3]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFailure(value: ActionBuilderConstructor[T3, P3, js.UndefOr[scala.Nothing]]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestFunction2(value: (P1, js.UndefOr[scala.Nothing]) => PayloadMetaAction[T1, P1, js.UndefOr[scala.Nothing]]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRequestFunction1(value: P1 => PayloadAction[T1, P1]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestFunction0(value: () => EmptyAction[T1]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequest(value: ActionBuilderConstructor[T1, P1, js.UndefOr[scala.Nothing]]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessFunction2(value: (P2, js.UndefOr[scala.Nothing]) => PayloadMetaAction[T2, P2, js.UndefOr[scala.Nothing]]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSuccessFunction1(value: P2 => PayloadAction[T2, P2]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuccessFunction0(value: () => EmptyAction[T2]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSuccess(value: ActionBuilderConstructor[T2, P2, js.UndefOr[scala.Nothing]]): Self[TRequest, TSuccess, TFailure, TCancel, T1, P1, T2, P2, T3, P3, T4, P4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

