package typingsSlinky.tern.ternMod

import typingsSlinky.tern.ternStrings.`type`
import typingsSlinky.tern.ternStrings.completions
import typingsSlinky.tern.ternStrings.definition
import typingsSlinky.tern.ternStrings.documentation
import typingsSlinky.tern.ternStrings.files
import typingsSlinky.tern.ternStrings.properties
import typingsSlinky.tern.ternStrings.refs
import typingsSlinky.tern.ternStrings.rename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Query extends js.Object

object Query {
  @scala.inline
  def CompletionsQuery(end: Double | Position, file: String, `type`: completions): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def TypeQuery(end: Double | Position, file: String, `type`: `type`): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def FilesQuery(`type`: files): Query = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def RenameQuery(end: Double | Position, file: String, newName: String, `type`: rename): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def RefsQuery(end: Double | Position, file: String, `type`: refs): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def DocumentationQuery(end: Double | Position, file: String, `type`: documentation): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def DefinitionQuery(end: Double | Position, file: String, `type`: definition): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def PropertiesQuery(`type`: properties): Query = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

