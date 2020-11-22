package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.relationIdMetadataArgsMod.RelationIdMetadataArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsRelationIdMetadataArgs extends js.Object {
  
  var args: RelationIdMetadataArgs = js.native
  
  var entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata = js.native
}
object ArgsRelationIdMetadataArgs {
  
  @scala.inline
  def apply(
    args: RelationIdMetadataArgs,
    entityMetadata: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
  ): ArgsRelationIdMetadataArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsRelationIdMetadataArgs]
  }
  
  @scala.inline
  implicit class ArgsRelationIdMetadataArgsOps[Self <: ArgsRelationIdMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: RelationIdMetadataArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata): Self = this.set("entityMetadata", value.asInstanceOf[js.Any])
  }
}
