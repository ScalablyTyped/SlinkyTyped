package typingsSlinky.tern.ternMod

import typingsSlinky.tern.ternStrings.`type`
import typingsSlinky.tern.ternStrings.completions
import typingsSlinky.tern.ternStrings.definition
import typingsSlinky.tern.ternStrings.documentation
import typingsSlinky.tern.ternStrings.files
import typingsSlinky.tern.ternStrings.properties
import typingsSlinky.tern.ternStrings.refs
import typingsSlinky.tern.ternStrings.rename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tern.ternMod.FilesQuery
  - typingsSlinky.tern.ternMod.RenameQuery
  - typingsSlinky.tern.ternMod.TypeQuery
  - typingsSlinky.tern.ternMod.RefsQuery
  - typingsSlinky.tern.ternMod.CompletionsQuery
  - typingsSlinky.tern.ternMod.DocumentationQuery
  - typingsSlinky.tern.ternMod.PropertiesQuery
  - typingsSlinky.tern.ternMod.DefinitionQuery
*/
trait Query extends StObject
object Query {
  
  @scala.inline
  def CompletionsQuery(end: Double | Position, file: String, `type`: completions): typingsSlinky.tern.ternMod.CompletionsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tern.ternMod.CompletionsQuery]
  }
  
  @scala.inline
  def DefinitionQuery(end: Double | Position, file: String, `type`: definition): typingsSlinky.tern.ternMod.DefinitionQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tern.ternMod.DefinitionQuery]
  }
  
  @scala.inline
  def DocumentationQuery(end: Double | Position, file: String, `type`: documentation): typingsSlinky.tern.ternMod.DocumentationQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tern.ternMod.DocumentationQuery]
  }
  
  @scala.inline
  def FilesQuery(`type`: files): typingsSlinky.tern.ternMod.FilesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tern.ternMod.FilesQuery]
  }
  
  @scala.inline
  def PropertiesQuery(`type`: properties): typingsSlinky.tern.ternMod.PropertiesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tern.ternMod.PropertiesQuery]
  }
  
  @scala.inline
  def RefsQuery(end: Double | Position, file: String, `type`: refs): typingsSlinky.tern.ternMod.RefsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tern.ternMod.RefsQuery]
  }
  
  @scala.inline
  def RenameQuery(end: Double | Position, file: String, newName: String, `type`: rename): typingsSlinky.tern.ternMod.RenameQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tern.ternMod.RenameQuery]
  }
  
  @scala.inline
  def TypeQuery(end: Double | Position, file: String, `type`: `type`): typingsSlinky.tern.ternMod.TypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tern.ternMod.TypeQuery]
  }
}
