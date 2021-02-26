package typingsSlinky.ssh2.mod

import typingsSlinky.node.Buffer
import typingsSlinky.ssh2Streams.mod.ParsedKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("ssh2", "utils.parseKey")
  @js.native
  def parseKey(keyData: String): ParsedKey | js.Array[ParsedKey] | js.Error | Null = js.native
  @JSImport("ssh2", "utils.parseKey")
  @js.native
  def parseKey(keyData: String, passphrase: String): ParsedKey | js.Array[ParsedKey] | js.Error | Null = js.native
  @JSImport("ssh2", "utils.parseKey")
  @js.native
  def parseKey(keyData: Buffer): ParsedKey | js.Array[ParsedKey] | js.Error | Null = js.native
  @JSImport("ssh2", "utils.parseKey")
  @js.native
  def parseKey(keyData: Buffer, passphrase: String): ParsedKey | js.Array[ParsedKey] | js.Error | Null = js.native
}
