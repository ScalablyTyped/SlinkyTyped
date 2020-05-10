package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of one or more available refactoring actions, grouped under a parent refactoring.
  */
@js.native
trait ApplicableRefactorInfo extends js.Object {
  var actions: js.Array[RefactorActionInfo] = js.native
  /**
    * A description of this refactoring category to show to the user.
    * If the refactoring gets inlined (see below), this text will not be visible.
    */
  var description: java.lang.String = js.native
  /**
    * Inlineable refactorings can have their actions hoisted out to the top level
    * of a context menu. Non-inlineanable refactorings should always be shown inside
    * their parent grouping.
    *
    * If not specified, this value is assumed to be 'true'
    */
  var inlineable: js.UndefOr[Boolean] = js.native
  /**
    * The programmatic name of the refactoring
    */
  var name: java.lang.String = js.native
}

object ApplicableRefactorInfo {
  @scala.inline
  def apply(actions: js.Array[RefactorActionInfo], description: java.lang.String, name: java.lang.String): ApplicableRefactorInfo = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicableRefactorInfo]
  }
  @scala.inline
  implicit class ApplicableRefactorInfoOps[Self <: ApplicableRefactorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[RefactorActionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
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
    @scala.inline
    def withInlineable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineable")(js.undefined)
        ret
    }
  }
  
}

