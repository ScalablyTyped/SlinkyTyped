package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single refactoring action - for example, the "Extract Method..." refactor might
  * offer several actions, each corresponding to a surround class or closure to extract into.
  */
@js.native
trait RefactorActionInfo extends js.Object {
  /**
    * A description of this refactoring action to show to the user.
    * If the parent refactoring is inlined away, this will be the only text shown,
    * so this description should make sense by itself if the parent is inlineable=true
    */
  var description: java.lang.String = js.native
  /**
    * The programmatic name of the refactoring action
    */
  var name: java.lang.String = js.native
}

object RefactorActionInfo {
  @scala.inline
  def apply(description: java.lang.String, name: java.lang.String): RefactorActionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefactorActionInfo]
  }
  @scala.inline
  implicit class RefactorActionInfoOps[Self <: RefactorActionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

