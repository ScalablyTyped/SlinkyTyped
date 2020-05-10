package typingsSlinky.windowsService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOptions extends js.Object {
  /**
    * The services display name, defaults to the name parameter
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * An array of strings specifying parameters to pass to nodePath, defaults to []
    */
  var nodeArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fully qualified path to the node binary used to run the service (i.e. c:\Program Files\nodejs\node.exe, defaults to the value of process.execPath
    */
  var nodePath: js.UndefOr[String] = js.native
  /**
    * An array of strings specifying parameters to pass to programPath, defaults to []
    */
  var programArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The program to run using nodePath, defaults to the value of process.argv[1]
    */
  var programPath: js.UndefOr[String] = js.native
}

object AddOptions {
  @scala.inline
  def apply(): AddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOptions]
  }
  @scala.inline
  implicit class AddOptionsOps[Self <: AddOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withNodePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePath")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programPath")(js.undefined)
        ret
    }
  }
  
}

