package typingsSlinky.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterer {
  
  @JSImport("yandex-maps", "clusterer.Balloon")
  @js.native
  class Balloon protected () extends IBalloonManager[Clusterer_] {
    def this(clusterer: Clusterer_) = this()
  }
  
  @JSImport("yandex-maps", "clusterer.Hint")
  @js.native
  class Hint protected () extends IPopupManager[Clusterer_] {
    def this(clusterer: Clusterer_) = this()
  }
}
