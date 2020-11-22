package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.entityListenerMetadataArgsMod.EntityListenerMetadataArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedMetadata extends js.Object {
  
  var args: EntityListenerMetadataArgs = js.native
  
  var embeddedMetadata: js.UndefOr[typingsSlinky.typeorm.embeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata = js.native
}
object EmbeddedMetadata {
  
  @scala.inline
  def apply(
    args: EntityListenerMetadataArgs,
    entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
  ): EmbeddedMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedMetadata]
  }
  
  @scala.inline
  implicit class EmbeddedMetadataOps[Self <: EmbeddedMetadata] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: EntityListenerMetadataArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata): Self = this.set("entityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadata(value: typingsSlinky.typeorm.embeddedMetadataMod.EmbeddedMetadata): Self = this.set("embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedMetadata: Self = this.set("embeddedMetadata", js.undefined)
  }
}
