package typingsSlinky.walkSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("walk-sync", "Entry")
@js.native
class Entry protected () extends js.Object {
  def this(relativePath: String, basePath: String, mode: Double, size: Double, mtime: Double) = this()
  
  var basePath: String = js.native
  
  def fullPath: String = js.native
  
  def isDirectory(): Boolean = js.native
  
  var mode: Double = js.native
  
  var mtime: Double = js.native
  
  var relativePath: String = js.native
  
  var size: Double = js.native
}
