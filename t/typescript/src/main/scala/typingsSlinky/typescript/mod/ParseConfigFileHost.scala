package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseConfigFileHost
  extends ParseConfigHost
     with ConfigFileDiagnosticsReporter {
  def getCurrentDirectory(): java.lang.String = js.native
}

