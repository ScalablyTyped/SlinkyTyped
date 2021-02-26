package typingsSlinky.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolInformation extends StObject {
  
  /**
    * The name of the symbol containing this symbol. This information is for
    * user interface purposes (e.g. to render a qualifier in the user interface
    * if necessary). It can't be used to re-infer a hierarchy for the document
    * symbols.
    */
  var containerName: js.UndefOr[String] = js.native
  
  /**
    * Indicates if this symbol is deprecated.
    */
  var deprecated: js.UndefOr[Boolean] = js.native
  
  /**
    * The kind of this symbol.
    */
  var kind: SymbolKind = js.native
  
  /**
    * The location of this symbol. The location's range is used by a tool
    * to reveal the location in the editor. If the symbol is selected in the
    * tool the range's start information is used to position the cursor. So
    * the range usually spans more than the actual symbol's name and does
    * normally include thinks like visibility modifiers.
    *
    * The range doesn't have to denote a node range in the sense of a abstract
    * syntax tree. It can therefore not be used to re-construct a hierarchy of
    * the symbols.
    */
  var location: Location = js.native
  
  /**
    * The name of this symbol.
    */
  var name: String = js.native
}
object SymbolInformation {
  
  @scala.inline
  def apply(kind: SymbolKind, location: Location, name: String): SymbolInformation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolInformation]
  }
  
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the location of the symbol.
    * @param uri The resource of the location of symbol, defaults to the current document.
    * @param containerName The name of the symbol containing the symbol.
    */
  @JSImport("vscode-languageserver-types", "SymbolInformation.create")
  @js.native
  def create(name: String, kind: SymbolKind, range: Range): SymbolInformation = js.native
  @JSImport("vscode-languageserver-types", "SymbolInformation.create")
  @js.native
  def create(
    name: String,
    kind: SymbolKind,
    range: Range,
    uri: js.UndefOr[scala.Nothing],
    containerName: String
  ): SymbolInformation = js.native
  @JSImport("vscode-languageserver-types", "SymbolInformation.create")
  @js.native
  def create(name: String, kind: SymbolKind, range: Range, uri: String): SymbolInformation = js.native
  @JSImport("vscode-languageserver-types", "SymbolInformation.create")
  @js.native
  def create(name: String, kind: SymbolKind, range: Range, uri: String, containerName: String): SymbolInformation = js.native
  
  @scala.inline
  implicit class SymbolInformationMutableBuilder[Self <: SymbolInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setKind(value: SymbolKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
