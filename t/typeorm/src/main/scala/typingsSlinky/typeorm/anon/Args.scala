package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.tableMetadataArgsMod.TableMetadataArgs
import typingsSlinky.typeorm.treeMetadataArgsMod.TreeMetadataArgs
import typingsSlinky.typeorm.typeormStrings.STI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Args extends StObject {
  
  var args: TableMetadataArgs = js.native
  
  var connection: typingsSlinky.typeorm.connectionMod.Connection = js.native
  
  var inheritancePattern: js.UndefOr[STI] = js.native
  
  var inheritanceTree: js.UndefOr[js.Array[js.Function]] = js.native
  
  var parentClosureEntityMetadata: js.UndefOr[typingsSlinky.typeorm.entityMetadataMod.EntityMetadata] = js.native
  
  var tableTree: js.UndefOr[TreeMetadataArgs] = js.native
}
object Args {
  
  @scala.inline
  def apply(args: TableMetadataArgs, connection: typingsSlinky.typeorm.connectionMod.Connection): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: TableMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: typingsSlinky.typeorm.connectionMod.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritancePattern(value: STI): Self = StObject.set(x, "inheritancePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritancePatternUndefined: Self = StObject.set(x, "inheritancePattern", js.undefined)
    
    @scala.inline
    def setInheritanceTree(value: js.Array[js.Function]): Self = StObject.set(x, "inheritanceTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritanceTreeUndefined: Self = StObject.set(x, "inheritanceTree", js.undefined)
    
    @scala.inline
    def setInheritanceTreeVarargs(value: js.Function*): Self = StObject.set(x, "inheritanceTree", js.Array(value :_*))
    
    @scala.inline
    def setParentClosureEntityMetadata(value: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "parentClosureEntityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentClosureEntityMetadataUndefined: Self = StObject.set(x, "parentClosureEntityMetadata", js.undefined)
    
    @scala.inline
    def setTableTree(value: TreeMetadataArgs): Self = StObject.set(x, "tableTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableTreeUndefined: Self = StObject.set(x, "tableTree", js.undefined)
  }
}
