package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.DoneInvokeEvent
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.InvokeCallback
import typingsSlinky.xstate.typesMod.InvokeConfig
import typingsSlinky.xstate.typesMod.InvokeCreator
import typingsSlinky.xstate.typesMod.Mapper
import typingsSlinky.xstate.typesMod.PropertyMapper
import typingsSlinky.xstate.typesMod.SingleOrArray
import typingsSlinky.xstate.typesMod.StateMachine
import typingsSlinky.xstate.typesMod.Subscribable
import typingsSlinky.xstate.typesMod.TransitionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[TContext, TEvent /* <: EventObject */] extends InvokeConfig[TContext, TEvent] {
  /**
    * If `true`, events sent to the parent service will be forwarded to the invoked service.
    *
    * Default: `false`
    */
  var autoForward: js.UndefOr[Boolean] = js.native
  /**
    * Data from the parent machine's context to set as the (partial or full) context
    * for the invoked child machine.
    *
    * Data should be mapped to match the child machine's context shape.
    */
  var data: js.UndefOr[(Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent])] = js.native
  /**
    * @deprecated
    *
    *  Use `autoForward` property instead of `forward`. Support for `forward` will get removed in the future.
    */
  var forward: js.UndefOr[Boolean] = js.native
  /**
    * The unique identifier for the invoked machine. If not specified, this
    * will be the machine's own `id`, or the URL (from `src`).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The transition to take upon the invoked child machine reaching its final top-level state.
    */
  var onDone: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])] = js.native
  /**
    * The transition to take upon the invoked child machine sending an error event.
    */
  var onError: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])] = js.native
  /**
    * The source of the machine to be invoked, or the machine itself.
    */
  var src: String | (StateMachine[_, _, _, _]) | (InvokeCreator[TContext, TEvent, _]) = js.native
}

object Data {
  @scala.inline
  def apply[TContext, TEvent](src: String | (StateMachine[_, _, _, _]) | (InvokeCreator[TContext, TEvent, _])): Data[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TContext, TEvent]]
  }
  @scala.inline
  implicit class DataOps[Self[tcontext, tevent] <: Data[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withSrcFunction2(
      value: (TContext, TEvent) => js.Thenable[_] | (StateMachine[_, js.Any, js.Any, js.Any]) | Subscribable[js.Any] | InvokeCallback
    ): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSrc(value: String | (StateMachine[_, _, _, _]) | (InvokeCreator[TContext, TEvent, _])): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoForward(value: Boolean): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoForward: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoForward")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFunction2(value: (TContext, TEvent) => js.Any): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withData(value: (Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent])): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withForward(value: Boolean): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDone(value: String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDone: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnError: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
  }
  
}

