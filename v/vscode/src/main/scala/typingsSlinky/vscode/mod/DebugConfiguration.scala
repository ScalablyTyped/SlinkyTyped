package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugConfiguration
  extends /**
		 * Additional debug type specific properties.
		 */
/* key */ StringDictionary[js.Any] {
  /**
  		 * The name of the debug session.
  		 */
  var name: String = js.native
  /**
  		 * The request type of the debug session.
  		 */
  var request: String = js.native
  /**
  		 * The type of the debug session.
  		 */
  var `type`: String = js.native
}

object DebugConfiguration {
  @scala.inline
  def apply(name: String, request: String, `type`: String): DebugConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugConfiguration]
  }
  @scala.inline
  implicit class DebugConfigurationOps[Self <: DebugConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

