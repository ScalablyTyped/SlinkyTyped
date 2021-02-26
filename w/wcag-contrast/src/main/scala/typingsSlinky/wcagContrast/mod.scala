package typingsSlinky.wcagContrast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wcag-contrast", "hex")
  @js.native
  def hex(a: String, b: String): Double = js.native
  
  @JSImport("wcag-contrast", "luminance")
  @js.native
  def luminance(a: Double, b: Double): Double = js.native
  
  @JSImport("wcag-contrast", "rgb")
  @js.native
  def rgb(a: RGBColor, b: RGBColor): Double = js.native
  
  @JSImport("wcag-contrast", "score")
  @js.native
  def score(contrast: Double): Score_ = js.native
  
  type RGBColor = js.Tuple3[Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wcagContrast.wcagContrastStrings.AAA
    - typingsSlinky.wcagContrast.wcagContrastStrings.AA
    - typingsSlinky.wcagContrast.wcagContrastStrings.`AA Large`
    - typingsSlinky.wcagContrast.wcagContrastStrings.Fail
  */
  trait Score_ extends StObject
  object Score_ {
    
    @scala.inline
    def AA: typingsSlinky.wcagContrast.wcagContrastStrings.AA = "AA".asInstanceOf[typingsSlinky.wcagContrast.wcagContrastStrings.AA]
    
    @scala.inline
    def `AA Large`: typingsSlinky.wcagContrast.wcagContrastStrings.`AA Large` = ("AA Large").asInstanceOf[typingsSlinky.wcagContrast.wcagContrastStrings.`AA Large`]
    
    @scala.inline
    def AAA: typingsSlinky.wcagContrast.wcagContrastStrings.AAA = "AAA".asInstanceOf[typingsSlinky.wcagContrast.wcagContrastStrings.AAA]
    
    @scala.inline
    def Fail: typingsSlinky.wcagContrast.wcagContrastStrings.Fail = "Fail".asInstanceOf[typingsSlinky.wcagContrast.wcagContrastStrings.Fail]
  }
}
