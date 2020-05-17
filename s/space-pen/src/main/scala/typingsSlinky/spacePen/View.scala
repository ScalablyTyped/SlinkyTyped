package typingsSlinky.spacePen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  def bindEventHandlers(view: View): Unit = js.native
  def buildHtml(params: js.Any): js.Any = js.native
  def command(commandName: js.Any, selector: js.Any, options: js.Any, handler: js.Any): js.Any = js.native
  def end(): js.Any = js.native
  // tag end
  def initialize(view: View, args: js.Any): Unit = js.native
  def preempt(eventName: js.Any, handler: js.Any): js.Any = js.native
  def pushStack(elems: js.Any): js.Any = js.native
  def wireOutlets(view: View): Unit = js.native
}

object View {
  @scala.inline
  def apply(
    bindEventHandlers: View => Unit,
    buildHtml: js.Any => js.Any,
    command: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    end: () => js.Any,
    initialize: (View, js.Any) => Unit,
    preempt: (js.Any, js.Any) => js.Any,
    pushStack: js.Any => js.Any,
    wireOutlets: View => Unit
  ): View = {
    val __obj = js.Dynamic.literal(bindEventHandlers = js.Any.fromFunction1(bindEventHandlers), buildHtml = js.Any.fromFunction1(buildHtml), command = js.Any.fromFunction4(command), end = js.Any.fromFunction0(end), initialize = js.Any.fromFunction2(initialize), preempt = js.Any.fromFunction2(preempt), pushStack = js.Any.fromFunction1(pushStack), wireOutlets = js.Any.fromFunction1(wireOutlets))
    __obj.asInstanceOf[View]
  }
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindEventHandlers(value: View => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindEventHandlers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuildHtml(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommand(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitialize(value: (View, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPreempt(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preempt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPushStack(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushStack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWireOutlets(value: View => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireOutlets")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

