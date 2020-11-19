package typingsSlinky.swPrecacheWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkName extends js.Object {
  
  var chunkName: js.UndefOr[String] = js.native
  
  var filename: js.UndefOr[String] = js.native
}
object ChunkName {
  
  @scala.inline
  def apply(): ChunkName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkName]
  }
  
  @scala.inline
  implicit class ChunkNameOps[Self <: ChunkName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChunkName(value: String): Self = this.set("chunkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkName: Self = this.set("chunkName", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
  }
}
