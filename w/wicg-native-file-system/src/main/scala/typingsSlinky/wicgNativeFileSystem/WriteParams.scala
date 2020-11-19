package typingsSlinky.wicgNativeFileSystem

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.BufferSource
import typingsSlinky.wicgNativeFileSystem.wicgNativeFileSystemStrings.seek
import typingsSlinky.wicgNativeFileSystem.wicgNativeFileSystemStrings.truncate
import typingsSlinky.wicgNativeFileSystem.wicgNativeFileSystemStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wicgNativeFileSystem.anon.Data
  - typingsSlinky.wicgNativeFileSystem.anon.Position
  - typingsSlinky.wicgNativeFileSystem.anon.Size
*/
trait WriteParams extends js.Object
object WriteParams {
  
  @scala.inline
  def Data(data: BufferSource | Blob | String, `type`: write): WriteParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteParams]
  }
  
  @scala.inline
  def Position(position: Double, `type`: seek): WriteParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteParams]
  }
  
  @scala.inline
  def Size(size: Double, `type`: truncate): WriteParams = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteParams]
  }
}
