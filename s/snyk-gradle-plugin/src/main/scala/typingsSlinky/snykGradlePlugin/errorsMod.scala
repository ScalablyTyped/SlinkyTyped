package typingsSlinky.snykGradlePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-gradle-plugin/dist/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class MissingSubProjectError protected ()
    extends typingsSlinky.snykGradlePlugin.missingSubProjectErrorMod.MissingSubProjectError {
    def this(subProject: String, allProjects: js.Array[String]) = this()
  }
  
}

