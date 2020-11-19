package typingsSlinky.urqlCore.ssrMod

import typingsSlinky.urqlCore.typesMod.Exchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSRExchange_ extends Exchange {
  
  /** Extracts cached data */
  def extractData(): SSRData = js.native
  
  /** Rehydrates cached data */
  def restoreData(data: SSRData): Unit = js.native
}
