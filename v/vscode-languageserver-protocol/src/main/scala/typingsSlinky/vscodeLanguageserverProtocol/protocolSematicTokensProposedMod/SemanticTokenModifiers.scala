package typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticTokenModifiers extends StObject
@JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokenModifiers")
@js.native
object SemanticTokenModifiers extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemanticTokenModifiers with String] = js.native
  
  @js.native
  sealed trait `abstract` extends SemanticTokenModifiers
  /* "abstract" */ val `abstract`: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.`abstract` with String = js.native
  
  @js.native
  sealed trait async extends SemanticTokenModifiers
  /* "async" */ val async: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.async with String = js.native
  
  @js.native
  sealed trait declaration extends SemanticTokenModifiers
  /* "declaration" */ val declaration: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.declaration with String = js.native
  
  @js.native
  sealed trait definition extends SemanticTokenModifiers
  /* "definition" */ val definition: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.definition with String = js.native
  
  @js.native
  sealed trait deprecated extends SemanticTokenModifiers
  /* "deprecated" */ val deprecated: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.deprecated with String = js.native
  
  @js.native
  sealed trait documentation extends SemanticTokenModifiers
  /* "documentation" */ val documentation: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.documentation with String = js.native
  
  @js.native
  sealed trait readonly extends SemanticTokenModifiers
  /* "readonly" */ val readonly: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.readonly with String = js.native
  
  @js.native
  sealed trait reference extends SemanticTokenModifiers
  /* "reference" */ val reference: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.reference with String = js.native
  
  @js.native
  sealed trait static extends SemanticTokenModifiers
  /* "static" */ val static: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.static with String = js.native
  
  @js.native
  sealed trait volatile extends SemanticTokenModifiers
  /* "volatile" */ val volatile: typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.volatile with String = js.native
}
