package typingsSlinky.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowDuplication extends js.Object {
  /**
    * Enables duplication of entire project with 
    * full history (requires at least mongodb 2.6).
    *   config.seedProjects.allowDuplication = true;
    */
  var allowDuplication: Boolean = js.native
  /**
    * List of directories where project seeds are stored.
    *   config.seedProjects.basePaths = ['./seeds'];
    */
  var basePaths: js.Array[String] = js.native
  /**
    * Used by the GUI when highlighting/selecting
    * the default project to seed from.
    *   config.seedProjects.defaultProject = 'EmptyProject';
    */
  var defaultProject: String = js.native
  /**
    * Enables creation of new projects using seeds.
    *   config.seedProjects.enable = true;
    */
  var enable: Boolean = js.native
}

object AnonAllowDuplication {
  @scala.inline
  def apply(allowDuplication: Boolean, basePaths: js.Array[String], defaultProject: String, enable: Boolean): AnonAllowDuplication = {
    val __obj = js.Dynamic.literal(allowDuplication = allowDuplication.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], defaultProject = defaultProject.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowDuplication]
  }
  @scala.inline
  implicit class AnonAllowDuplicationOps[Self <: AnonAllowDuplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDuplication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

