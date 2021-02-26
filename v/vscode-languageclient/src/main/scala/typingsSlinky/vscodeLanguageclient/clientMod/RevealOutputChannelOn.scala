package typingsSlinky.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RevealOutputChannelOn extends StObject
@JSImport("vscode-languageclient/lib/client", "RevealOutputChannelOn")
@js.native
object RevealOutputChannelOn extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RevealOutputChannelOn with Double] = js.native
  
  @js.native
  sealed trait Error extends RevealOutputChannelOn
  /* 3 */ val Error: typingsSlinky.vscodeLanguageclient.clientMod.RevealOutputChannelOn.Error with Double = js.native
  
  @js.native
  sealed trait Info extends RevealOutputChannelOn
  /* 1 */ val Info: typingsSlinky.vscodeLanguageclient.clientMod.RevealOutputChannelOn.Info with Double = js.native
  
  @js.native
  sealed trait Never extends RevealOutputChannelOn
  /* 4 */ val Never: typingsSlinky.vscodeLanguageclient.clientMod.RevealOutputChannelOn.Never with Double = js.native
  
  @js.native
  sealed trait Warn extends RevealOutputChannelOn
  /* 2 */ val Warn: typingsSlinky.vscodeLanguageclient.clientMod.RevealOutputChannelOn.Warn with Double = js.native
}
