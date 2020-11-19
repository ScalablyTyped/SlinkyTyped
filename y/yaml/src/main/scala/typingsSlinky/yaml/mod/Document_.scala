package typingsSlinky.yaml.mod

import typingsSlinky.yaml.mod.Document.Anchors
import typingsSlinky.yaml.mod.Document.TagPrefix
import typingsSlinky.yaml.typesMod.Collection
import typingsSlinky.yaml.typesMod.Schema.Name
import typingsSlinky.yaml.typesMod.Schema.Tag
import typingsSlinky.yaml.typesMod.Schema.TagId
import typingsSlinky.yaml.utilMod.Type.DOCUMENT
import typingsSlinky.yaml.utilMod.YAMLError
import typingsSlinky.yaml.utilMod.YAMLWarning
import typingsSlinky.yaml.yamlStrings.`1Dot0`
import typingsSlinky.yaml.yamlStrings.`1Dot1`
import typingsSlinky.yaml.yamlStrings.`1Dot2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml", "Document")
@js.native
class Document_ () extends Collection {
  def this(options: Options) = this()
  
  /**
    * Anchors associated with the document's nodes;
    * also provides alias & merge node creators.
    */
  var anchors: Anchors = js.native
  
  /** The document contents. */
  var contents: js.Any = js.native
  
  @JSName("cstNode")
  var cstNode_Document_ : js.UndefOr[typingsSlinky.yaml.parseCstMod.CST.Document] = js.native
  
  var directivesEndMarker: js.UndefOr[Boolean] = js.native
  
  /** Errors encountered during parsing. */
  var errors: js.Array[YAMLError] = js.native
  
  /**
    * List the tags used in the document that are not in the default
    * `tag:yaml.org,2002:` namespace.
    */
  def listNonDefaultTags(): js.Array[String] = js.native
  
  /** Parse a CST into this document */
  def parse(cst: typingsSlinky.yaml.parseCstMod.CST.Document): this.type = js.native
  
  /**
    * When a document is created with `new YAML.Document()`, the schema object is
    * not set as it may be influenced by parsed directives; call this with no
    * arguments to set it manually, or with arguments to change the schema used
    * by the document.
    **/
  def setSchema(): Unit = js.native
  def setSchema(id: js.UndefOr[`1Dot0` | `1Dot1` | `1Dot2`]): Unit = js.native
  def setSchema(id: js.UndefOr[`1Dot0` | `1Dot1` | `1Dot2`], customTags: js.Array[Tag | TagId]): Unit = js.native
  def setSchema(id: Name): Unit = js.native
  def setSchema(id: Name, customTags: js.Array[TagId | Tag]): Unit = js.native
  
  /** Set `handle` as a shorthand string for the `prefix` tag namespace. */
  def setTagPrefix(handle: String, prefix: String): Unit = js.native
  
  /**
    * Array of prefixes; each will have a string `handle` that
    * starts and ends with `!` and a string `prefix` that the handle will be replaced by.
    */
  var tagPrefixes: js.Array[TagPrefix] = js.native
  
  def toJSON(
    arg: js.UndefOr[scala.Nothing],
    onAnchor: js.Function2[/* value */ js.Any, /* count */ Double, Unit]
  ): js.Any = js.native
  def toJSON(arg: String): js.Any = js.native
  def toJSON(arg: String, onAnchor: js.Function2[/* value */ js.Any, /* count */ Double, Unit]): js.Any = js.native
  
  @JSName("type")
  var type_Document_ : DOCUMENT = js.native
  
  /**
    * The parsed version of the source document;
    * if true-ish, stringified output will include a `%YAML` directive.
    */
  var version: js.UndefOr[String] = js.native
  
  /** Warnings encountered during parsing. */
  var warnings: js.Array[YAMLWarning] = js.native
}
