package typingsSlinky.wicgFileSystemAccess.mod.global

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.BufferSource
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessStrings.seek
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessStrings.truncate
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wicgFileSystemAccess.anon.Data
  - typingsSlinky.wicgFileSystemAccess.anon.Position
  - typingsSlinky.wicgFileSystemAccess.anon.Size
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
