package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseNumbers.`10`
import typingsSlinky.stellarBase.stellarBaseNumbers.`11`
import typingsSlinky.stellarBase.stellarBaseNumbers.`12`
import typingsSlinky.stellarBase.stellarBaseNumbers.`13`
import typingsSlinky.stellarBase.stellarBaseNumbers.`14`
import typingsSlinky.stellarBase.stellarBaseNumbers.`15`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`6`
import typingsSlinky.stellarBase.stellarBaseNumbers.`7`
import typingsSlinky.stellarBase.stellarBaseNumbers.`8`
import typingsSlinky.stellarBase.stellarBaseNumbers.`9`
import typingsSlinky.stellarBase.stellarBaseStrings.auth
import typingsSlinky.stellarBase.stellarBaseStrings.dontHave
import typingsSlinky.stellarBase.stellarBaseStrings.errorMsg
import typingsSlinky.stellarBase.stellarBaseStrings.getPeers
import typingsSlinky.stellarBase.stellarBaseStrings.getScpQuorumset
import typingsSlinky.stellarBase.stellarBaseStrings.getScpState
import typingsSlinky.stellarBase.stellarBaseStrings.getTxSet
import typingsSlinky.stellarBase.stellarBaseStrings.hello
import typingsSlinky.stellarBase.stellarBaseStrings.peers
import typingsSlinky.stellarBase.stellarBaseStrings.scpMessage
import typingsSlinky.stellarBase.stellarBaseStrings.scpQuorumset
import typingsSlinky.stellarBase.stellarBaseStrings.surveyRequest
import typingsSlinky.stellarBase.stellarBaseStrings.surveyResponse
import typingsSlinky.stellarBase.stellarBaseStrings.transaction
import typingsSlinky.stellarBase.stellarBaseStrings.txSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageType extends StObject {
  
  val name: errorMsg | auth | dontHave | getPeers | peers | getTxSet | txSet | transaction | getScpQuorumset | scpQuorumset | scpMessage | getScpState | hello | surveyRequest | surveyResponse = js.native
  
  val value: `0` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
}
object MessageType {
  
  @scala.inline
  def apply(
    name: errorMsg | auth | dontHave | getPeers | peers | getTxSet | txSet | transaction | getScpQuorumset | scpQuorumset | scpMessage | getScpState | hello | surveyRequest | surveyResponse,
    value: `0` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
  ): MessageType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  
  @scala.inline
  implicit class MessageTypeMutableBuilder[Self <: MessageType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: errorMsg | auth | dontHave | getPeers | peers | getTxSet | txSet | transaction | getScpQuorumset | scpQuorumset | scpMessage | getScpState | hello | surveyRequest | surveyResponse
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(
      value: `0` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
