package typingsSlinky.vegaTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  type Color = ColorName | HexColor | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.vegaTypingsStrings.black
    - typingsSlinky.vegaTypings.vegaTypingsStrings.silver
    - typingsSlinky.vegaTypings.vegaTypingsStrings.gray
    - typingsSlinky.vegaTypings.vegaTypingsStrings.white
    - typingsSlinky.vegaTypings.vegaTypingsStrings.maroon
    - typingsSlinky.vegaTypings.vegaTypingsStrings.red
    - typingsSlinky.vegaTypings.vegaTypingsStrings.purple
    - typingsSlinky.vegaTypings.vegaTypingsStrings.fuchsia
    - typingsSlinky.vegaTypings.vegaTypingsStrings.green
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lime
    - typingsSlinky.vegaTypings.vegaTypingsStrings.olive
    - typingsSlinky.vegaTypings.vegaTypingsStrings.yellow
    - typingsSlinky.vegaTypings.vegaTypingsStrings.navy
    - typingsSlinky.vegaTypings.vegaTypingsStrings.blue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.teal
    - typingsSlinky.vegaTypings.vegaTypingsStrings.aqua
    - typingsSlinky.vegaTypings.vegaTypingsStrings.orange
    - typingsSlinky.vegaTypings.vegaTypingsStrings.aliceblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.antiquewhite
    - typingsSlinky.vegaTypings.vegaTypingsStrings.aquamarine
    - typingsSlinky.vegaTypings.vegaTypingsStrings.azure
    - typingsSlinky.vegaTypings.vegaTypingsStrings.beige
    - typingsSlinky.vegaTypings.vegaTypingsStrings.bisque
    - typingsSlinky.vegaTypings.vegaTypingsStrings.blanchedalmond
    - typingsSlinky.vegaTypings.vegaTypingsStrings.blueviolet
    - typingsSlinky.vegaTypings.vegaTypingsStrings.brown
    - typingsSlinky.vegaTypings.vegaTypingsStrings.burlywood
    - typingsSlinky.vegaTypings.vegaTypingsStrings.cadetblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.chartreuse
    - typingsSlinky.vegaTypings.vegaTypingsStrings.chocolate
    - typingsSlinky.vegaTypings.vegaTypingsStrings.coral
    - typingsSlinky.vegaTypings.vegaTypingsStrings.cornflowerblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.cornsilk
    - typingsSlinky.vegaTypings.vegaTypingsStrings.crimson
    - typingsSlinky.vegaTypings.vegaTypingsStrings.cyan
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkcyan
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkgoldenrod
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkgray
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkgreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkgrey
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkkhaki
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkmagenta
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkolivegreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkorange
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkorchid
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkred
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darksalmon
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkseagreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkslateblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkslategray
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkslategrey
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkturquoise
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darkviolet
    - typingsSlinky.vegaTypings.vegaTypingsStrings.deeppink
    - typingsSlinky.vegaTypings.vegaTypingsStrings.deepskyblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.dimgray
    - typingsSlinky.vegaTypings.vegaTypingsStrings.dimgrey
    - typingsSlinky.vegaTypings.vegaTypingsStrings.dodgerblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.firebrick
    - typingsSlinky.vegaTypings.vegaTypingsStrings.floralwhite
    - typingsSlinky.vegaTypings.vegaTypingsStrings.forestgreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.gainsboro
    - typingsSlinky.vegaTypings.vegaTypingsStrings.ghostwhite
    - typingsSlinky.vegaTypings.vegaTypingsStrings.gold
    - typingsSlinky.vegaTypings.vegaTypingsStrings.goldenrod
    - typingsSlinky.vegaTypings.vegaTypingsStrings.greenyellow
    - typingsSlinky.vegaTypings.vegaTypingsStrings.grey
    - typingsSlinky.vegaTypings.vegaTypingsStrings.honeydew
    - typingsSlinky.vegaTypings.vegaTypingsStrings.hotpink
    - typingsSlinky.vegaTypings.vegaTypingsStrings.indianred
    - typingsSlinky.vegaTypings.vegaTypingsStrings.indigo
    - typingsSlinky.vegaTypings.vegaTypingsStrings.ivory
    - typingsSlinky.vegaTypings.vegaTypingsStrings.khaki
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lavender
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lavenderblush
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lawngreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lemonchiffon
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightcoral
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightcyan
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightgoldenrodyellow
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightgray
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightgreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightgrey
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightpink
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightsalmon
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightseagreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightskyblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightslategray
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightslategrey
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightsteelblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lightyellow
    - typingsSlinky.vegaTypings.vegaTypingsStrings.limegreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.linen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.magenta
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mediumaquamarine
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mediumblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mediumorchid
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mediumpurple
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mediumseagreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mediumslateblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mediumspringgreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mediumturquoise
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mediumvioletred
    - typingsSlinky.vegaTypings.vegaTypingsStrings.midnightblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mintcream
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mistyrose
    - typingsSlinky.vegaTypings.vegaTypingsStrings.moccasin
    - typingsSlinky.vegaTypings.vegaTypingsStrings.navajowhite
    - typingsSlinky.vegaTypings.vegaTypingsStrings.oldlace
    - typingsSlinky.vegaTypings.vegaTypingsStrings.olivedrab
    - typingsSlinky.vegaTypings.vegaTypingsStrings.orangered
    - typingsSlinky.vegaTypings.vegaTypingsStrings.orchid
    - typingsSlinky.vegaTypings.vegaTypingsStrings.palegoldenrod
    - typingsSlinky.vegaTypings.vegaTypingsStrings.palegreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.paleturquoise
    - typingsSlinky.vegaTypings.vegaTypingsStrings.palevioletred
    - typingsSlinky.vegaTypings.vegaTypingsStrings.papayawhip
    - typingsSlinky.vegaTypings.vegaTypingsStrings.peachpuff
    - typingsSlinky.vegaTypings.vegaTypingsStrings.peru
    - typingsSlinky.vegaTypings.vegaTypingsStrings.pink
    - typingsSlinky.vegaTypings.vegaTypingsStrings.plum
    - typingsSlinky.vegaTypings.vegaTypingsStrings.powderblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.rosybrown
    - typingsSlinky.vegaTypings.vegaTypingsStrings.royalblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.saddlebrown
    - typingsSlinky.vegaTypings.vegaTypingsStrings.salmon
    - typingsSlinky.vegaTypings.vegaTypingsStrings.sandybrown
    - typingsSlinky.vegaTypings.vegaTypingsStrings.seagreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.seashell
    - typingsSlinky.vegaTypings.vegaTypingsStrings.sienna
    - typingsSlinky.vegaTypings.vegaTypingsStrings.skyblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.slateblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.slategray
    - typingsSlinky.vegaTypings.vegaTypingsStrings.slategrey
    - typingsSlinky.vegaTypings.vegaTypingsStrings.snow
    - typingsSlinky.vegaTypings.vegaTypingsStrings.springgreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.steelblue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.tan
    - typingsSlinky.vegaTypings.vegaTypingsStrings.thistle
    - typingsSlinky.vegaTypings.vegaTypingsStrings.tomato
    - typingsSlinky.vegaTypings.vegaTypingsStrings.turquoise
    - typingsSlinky.vegaTypings.vegaTypingsStrings.violet
    - typingsSlinky.vegaTypings.vegaTypingsStrings.wheat
    - typingsSlinky.vegaTypings.vegaTypingsStrings.whitesmoke
    - typingsSlinky.vegaTypings.vegaTypingsStrings.yellowgreen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.rebeccapurple
  */
  trait ColorName extends StObject
  object ColorName {
    
    @scala.inline
    def aliceblue: typingsSlinky.vegaTypings.vegaTypingsStrings.aliceblue = "aliceblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.aliceblue]
    
    @scala.inline
    def antiquewhite: typingsSlinky.vegaTypings.vegaTypingsStrings.antiquewhite = "antiquewhite".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.antiquewhite]
    
    @scala.inline
    def aqua: typingsSlinky.vegaTypings.vegaTypingsStrings.aqua = "aqua".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.aqua]
    
    @scala.inline
    def aquamarine: typingsSlinky.vegaTypings.vegaTypingsStrings.aquamarine = "aquamarine".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.aquamarine]
    
    @scala.inline
    def azure: typingsSlinky.vegaTypings.vegaTypingsStrings.azure = "azure".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.azure]
    
    @scala.inline
    def beige: typingsSlinky.vegaTypings.vegaTypingsStrings.beige = "beige".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.beige]
    
    @scala.inline
    def bisque: typingsSlinky.vegaTypings.vegaTypingsStrings.bisque = "bisque".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.bisque]
    
    @scala.inline
    def black: typingsSlinky.vegaTypings.vegaTypingsStrings.black = "black".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.black]
    
    @scala.inline
    def blanchedalmond: typingsSlinky.vegaTypings.vegaTypingsStrings.blanchedalmond = "blanchedalmond".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.blanchedalmond]
    
    @scala.inline
    def blue: typingsSlinky.vegaTypings.vegaTypingsStrings.blue = "blue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.blue]
    
    @scala.inline
    def blueviolet: typingsSlinky.vegaTypings.vegaTypingsStrings.blueviolet = "blueviolet".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.blueviolet]
    
    @scala.inline
    def brown: typingsSlinky.vegaTypings.vegaTypingsStrings.brown = "brown".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.brown]
    
    @scala.inline
    def burlywood: typingsSlinky.vegaTypings.vegaTypingsStrings.burlywood = "burlywood".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.burlywood]
    
    @scala.inline
    def cadetblue: typingsSlinky.vegaTypings.vegaTypingsStrings.cadetblue = "cadetblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.cadetblue]
    
    @scala.inline
    def chartreuse: typingsSlinky.vegaTypings.vegaTypingsStrings.chartreuse = "chartreuse".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.chartreuse]
    
    @scala.inline
    def chocolate: typingsSlinky.vegaTypings.vegaTypingsStrings.chocolate = "chocolate".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.chocolate]
    
    @scala.inline
    def coral: typingsSlinky.vegaTypings.vegaTypingsStrings.coral = "coral".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.coral]
    
    @scala.inline
    def cornflowerblue: typingsSlinky.vegaTypings.vegaTypingsStrings.cornflowerblue = "cornflowerblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.cornflowerblue]
    
    @scala.inline
    def cornsilk: typingsSlinky.vegaTypings.vegaTypingsStrings.cornsilk = "cornsilk".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.cornsilk]
    
    @scala.inline
    def crimson: typingsSlinky.vegaTypings.vegaTypingsStrings.crimson = "crimson".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.crimson]
    
    @scala.inline
    def cyan: typingsSlinky.vegaTypings.vegaTypingsStrings.cyan = "cyan".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.cyan]
    
    @scala.inline
    def darkblue: typingsSlinky.vegaTypings.vegaTypingsStrings.darkblue = "darkblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkblue]
    
    @scala.inline
    def darkcyan: typingsSlinky.vegaTypings.vegaTypingsStrings.darkcyan = "darkcyan".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkcyan]
    
    @scala.inline
    def darkgoldenrod: typingsSlinky.vegaTypings.vegaTypingsStrings.darkgoldenrod = "darkgoldenrod".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkgoldenrod]
    
    @scala.inline
    def darkgray: typingsSlinky.vegaTypings.vegaTypingsStrings.darkgray = "darkgray".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkgray]
    
    @scala.inline
    def darkgreen: typingsSlinky.vegaTypings.vegaTypingsStrings.darkgreen = "darkgreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkgreen]
    
    @scala.inline
    def darkgrey: typingsSlinky.vegaTypings.vegaTypingsStrings.darkgrey = "darkgrey".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkgrey]
    
    @scala.inline
    def darkkhaki: typingsSlinky.vegaTypings.vegaTypingsStrings.darkkhaki = "darkkhaki".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkkhaki]
    
    @scala.inline
    def darkmagenta: typingsSlinky.vegaTypings.vegaTypingsStrings.darkmagenta = "darkmagenta".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkmagenta]
    
    @scala.inline
    def darkolivegreen: typingsSlinky.vegaTypings.vegaTypingsStrings.darkolivegreen = "darkolivegreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkolivegreen]
    
    @scala.inline
    def darkorange: typingsSlinky.vegaTypings.vegaTypingsStrings.darkorange = "darkorange".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkorange]
    
    @scala.inline
    def darkorchid: typingsSlinky.vegaTypings.vegaTypingsStrings.darkorchid = "darkorchid".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkorchid]
    
    @scala.inline
    def darkred: typingsSlinky.vegaTypings.vegaTypingsStrings.darkred = "darkred".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkred]
    
    @scala.inline
    def darksalmon: typingsSlinky.vegaTypings.vegaTypingsStrings.darksalmon = "darksalmon".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darksalmon]
    
    @scala.inline
    def darkseagreen: typingsSlinky.vegaTypings.vegaTypingsStrings.darkseagreen = "darkseagreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkseagreen]
    
    @scala.inline
    def darkslateblue: typingsSlinky.vegaTypings.vegaTypingsStrings.darkslateblue = "darkslateblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkslateblue]
    
    @scala.inline
    def darkslategray: typingsSlinky.vegaTypings.vegaTypingsStrings.darkslategray = "darkslategray".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkslategray]
    
    @scala.inline
    def darkslategrey: typingsSlinky.vegaTypings.vegaTypingsStrings.darkslategrey = "darkslategrey".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkslategrey]
    
    @scala.inline
    def darkturquoise: typingsSlinky.vegaTypings.vegaTypingsStrings.darkturquoise = "darkturquoise".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkturquoise]
    
    @scala.inline
    def darkviolet: typingsSlinky.vegaTypings.vegaTypingsStrings.darkviolet = "darkviolet".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.darkviolet]
    
    @scala.inline
    def deeppink: typingsSlinky.vegaTypings.vegaTypingsStrings.deeppink = "deeppink".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.deeppink]
    
    @scala.inline
    def deepskyblue: typingsSlinky.vegaTypings.vegaTypingsStrings.deepskyblue = "deepskyblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.deepskyblue]
    
    @scala.inline
    def dimgray: typingsSlinky.vegaTypings.vegaTypingsStrings.dimgray = "dimgray".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.dimgray]
    
    @scala.inline
    def dimgrey: typingsSlinky.vegaTypings.vegaTypingsStrings.dimgrey = "dimgrey".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.dimgrey]
    
    @scala.inline
    def dodgerblue: typingsSlinky.vegaTypings.vegaTypingsStrings.dodgerblue = "dodgerblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.dodgerblue]
    
    @scala.inline
    def firebrick: typingsSlinky.vegaTypings.vegaTypingsStrings.firebrick = "firebrick".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.firebrick]
    
    @scala.inline
    def floralwhite: typingsSlinky.vegaTypings.vegaTypingsStrings.floralwhite = "floralwhite".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.floralwhite]
    
    @scala.inline
    def forestgreen: typingsSlinky.vegaTypings.vegaTypingsStrings.forestgreen = "forestgreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.forestgreen]
    
    @scala.inline
    def fuchsia: typingsSlinky.vegaTypings.vegaTypingsStrings.fuchsia = "fuchsia".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.fuchsia]
    
    @scala.inline
    def gainsboro: typingsSlinky.vegaTypings.vegaTypingsStrings.gainsboro = "gainsboro".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.gainsboro]
    
    @scala.inline
    def ghostwhite: typingsSlinky.vegaTypings.vegaTypingsStrings.ghostwhite = "ghostwhite".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.ghostwhite]
    
    @scala.inline
    def gold: typingsSlinky.vegaTypings.vegaTypingsStrings.gold = "gold".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.gold]
    
    @scala.inline
    def goldenrod: typingsSlinky.vegaTypings.vegaTypingsStrings.goldenrod = "goldenrod".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.goldenrod]
    
    @scala.inline
    def gray: typingsSlinky.vegaTypings.vegaTypingsStrings.gray = "gray".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.gray]
    
    @scala.inline
    def green: typingsSlinky.vegaTypings.vegaTypingsStrings.green = "green".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.green]
    
    @scala.inline
    def greenyellow: typingsSlinky.vegaTypings.vegaTypingsStrings.greenyellow = "greenyellow".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.greenyellow]
    
    @scala.inline
    def grey: typingsSlinky.vegaTypings.vegaTypingsStrings.grey = "grey".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.grey]
    
    @scala.inline
    def honeydew: typingsSlinky.vegaTypings.vegaTypingsStrings.honeydew = "honeydew".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.honeydew]
    
    @scala.inline
    def hotpink: typingsSlinky.vegaTypings.vegaTypingsStrings.hotpink = "hotpink".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.hotpink]
    
    @scala.inline
    def indianred: typingsSlinky.vegaTypings.vegaTypingsStrings.indianred = "indianred".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.indianred]
    
    @scala.inline
    def indigo: typingsSlinky.vegaTypings.vegaTypingsStrings.indigo = "indigo".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.indigo]
    
    @scala.inline
    def ivory: typingsSlinky.vegaTypings.vegaTypingsStrings.ivory = "ivory".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.ivory]
    
    @scala.inline
    def khaki: typingsSlinky.vegaTypings.vegaTypingsStrings.khaki = "khaki".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.khaki]
    
    @scala.inline
    def lavender: typingsSlinky.vegaTypings.vegaTypingsStrings.lavender = "lavender".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lavender]
    
    @scala.inline
    def lavenderblush: typingsSlinky.vegaTypings.vegaTypingsStrings.lavenderblush = "lavenderblush".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lavenderblush]
    
    @scala.inline
    def lawngreen: typingsSlinky.vegaTypings.vegaTypingsStrings.lawngreen = "lawngreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lawngreen]
    
    @scala.inline
    def lemonchiffon: typingsSlinky.vegaTypings.vegaTypingsStrings.lemonchiffon = "lemonchiffon".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lemonchiffon]
    
    @scala.inline
    def lightblue: typingsSlinky.vegaTypings.vegaTypingsStrings.lightblue = "lightblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightblue]
    
    @scala.inline
    def lightcoral: typingsSlinky.vegaTypings.vegaTypingsStrings.lightcoral = "lightcoral".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightcoral]
    
    @scala.inline
    def lightcyan: typingsSlinky.vegaTypings.vegaTypingsStrings.lightcyan = "lightcyan".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightcyan]
    
    @scala.inline
    def lightgoldenrodyellow: typingsSlinky.vegaTypings.vegaTypingsStrings.lightgoldenrodyellow = "lightgoldenrodyellow".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightgoldenrodyellow]
    
    @scala.inline
    def lightgray: typingsSlinky.vegaTypings.vegaTypingsStrings.lightgray = "lightgray".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightgray]
    
    @scala.inline
    def lightgreen: typingsSlinky.vegaTypings.vegaTypingsStrings.lightgreen = "lightgreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightgreen]
    
    @scala.inline
    def lightgrey: typingsSlinky.vegaTypings.vegaTypingsStrings.lightgrey = "lightgrey".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightgrey]
    
    @scala.inline
    def lightpink: typingsSlinky.vegaTypings.vegaTypingsStrings.lightpink = "lightpink".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightpink]
    
    @scala.inline
    def lightsalmon: typingsSlinky.vegaTypings.vegaTypingsStrings.lightsalmon = "lightsalmon".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightsalmon]
    
    @scala.inline
    def lightseagreen: typingsSlinky.vegaTypings.vegaTypingsStrings.lightseagreen = "lightseagreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightseagreen]
    
    @scala.inline
    def lightskyblue: typingsSlinky.vegaTypings.vegaTypingsStrings.lightskyblue = "lightskyblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightskyblue]
    
    @scala.inline
    def lightslategray: typingsSlinky.vegaTypings.vegaTypingsStrings.lightslategray = "lightslategray".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightslategray]
    
    @scala.inline
    def lightslategrey: typingsSlinky.vegaTypings.vegaTypingsStrings.lightslategrey = "lightslategrey".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightslategrey]
    
    @scala.inline
    def lightsteelblue: typingsSlinky.vegaTypings.vegaTypingsStrings.lightsteelblue = "lightsteelblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightsteelblue]
    
    @scala.inline
    def lightyellow: typingsSlinky.vegaTypings.vegaTypingsStrings.lightyellow = "lightyellow".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lightyellow]
    
    @scala.inline
    def lime: typingsSlinky.vegaTypings.vegaTypingsStrings.lime = "lime".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.lime]
    
    @scala.inline
    def limegreen: typingsSlinky.vegaTypings.vegaTypingsStrings.limegreen = "limegreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.limegreen]
    
    @scala.inline
    def linen: typingsSlinky.vegaTypings.vegaTypingsStrings.linen = "linen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.linen]
    
    @scala.inline
    def magenta: typingsSlinky.vegaTypings.vegaTypingsStrings.magenta = "magenta".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.magenta]
    
    @scala.inline
    def maroon: typingsSlinky.vegaTypings.vegaTypingsStrings.maroon = "maroon".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.maroon]
    
    @scala.inline
    def mediumaquamarine: typingsSlinky.vegaTypings.vegaTypingsStrings.mediumaquamarine = "mediumaquamarine".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mediumaquamarine]
    
    @scala.inline
    def mediumblue: typingsSlinky.vegaTypings.vegaTypingsStrings.mediumblue = "mediumblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mediumblue]
    
    @scala.inline
    def mediumorchid: typingsSlinky.vegaTypings.vegaTypingsStrings.mediumorchid = "mediumorchid".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mediumorchid]
    
    @scala.inline
    def mediumpurple: typingsSlinky.vegaTypings.vegaTypingsStrings.mediumpurple = "mediumpurple".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mediumpurple]
    
    @scala.inline
    def mediumseagreen: typingsSlinky.vegaTypings.vegaTypingsStrings.mediumseagreen = "mediumseagreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mediumseagreen]
    
    @scala.inline
    def mediumslateblue: typingsSlinky.vegaTypings.vegaTypingsStrings.mediumslateblue = "mediumslateblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mediumslateblue]
    
    @scala.inline
    def mediumspringgreen: typingsSlinky.vegaTypings.vegaTypingsStrings.mediumspringgreen = "mediumspringgreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mediumspringgreen]
    
    @scala.inline
    def mediumturquoise: typingsSlinky.vegaTypings.vegaTypingsStrings.mediumturquoise = "mediumturquoise".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mediumturquoise]
    
    @scala.inline
    def mediumvioletred: typingsSlinky.vegaTypings.vegaTypingsStrings.mediumvioletred = "mediumvioletred".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mediumvioletred]
    
    @scala.inline
    def midnightblue: typingsSlinky.vegaTypings.vegaTypingsStrings.midnightblue = "midnightblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.midnightblue]
    
    @scala.inline
    def mintcream: typingsSlinky.vegaTypings.vegaTypingsStrings.mintcream = "mintcream".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mintcream]
    
    @scala.inline
    def mistyrose: typingsSlinky.vegaTypings.vegaTypingsStrings.mistyrose = "mistyrose".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mistyrose]
    
    @scala.inline
    def moccasin: typingsSlinky.vegaTypings.vegaTypingsStrings.moccasin = "moccasin".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.moccasin]
    
    @scala.inline
    def navajowhite: typingsSlinky.vegaTypings.vegaTypingsStrings.navajowhite = "navajowhite".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.navajowhite]
    
    @scala.inline
    def navy: typingsSlinky.vegaTypings.vegaTypingsStrings.navy = "navy".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.navy]
    
    @scala.inline
    def oldlace: typingsSlinky.vegaTypings.vegaTypingsStrings.oldlace = "oldlace".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.oldlace]
    
    @scala.inline
    def olive: typingsSlinky.vegaTypings.vegaTypingsStrings.olive = "olive".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.olive]
    
    @scala.inline
    def olivedrab: typingsSlinky.vegaTypings.vegaTypingsStrings.olivedrab = "olivedrab".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.olivedrab]
    
    @scala.inline
    def orange: typingsSlinky.vegaTypings.vegaTypingsStrings.orange = "orange".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.orange]
    
    @scala.inline
    def orangered: typingsSlinky.vegaTypings.vegaTypingsStrings.orangered = "orangered".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.orangered]
    
    @scala.inline
    def orchid: typingsSlinky.vegaTypings.vegaTypingsStrings.orchid = "orchid".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.orchid]
    
    @scala.inline
    def palegoldenrod: typingsSlinky.vegaTypings.vegaTypingsStrings.palegoldenrod = "palegoldenrod".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.palegoldenrod]
    
    @scala.inline
    def palegreen: typingsSlinky.vegaTypings.vegaTypingsStrings.palegreen = "palegreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.palegreen]
    
    @scala.inline
    def paleturquoise: typingsSlinky.vegaTypings.vegaTypingsStrings.paleturquoise = "paleturquoise".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.paleturquoise]
    
    @scala.inline
    def palevioletred: typingsSlinky.vegaTypings.vegaTypingsStrings.palevioletred = "palevioletred".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.palevioletred]
    
    @scala.inline
    def papayawhip: typingsSlinky.vegaTypings.vegaTypingsStrings.papayawhip = "papayawhip".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.papayawhip]
    
    @scala.inline
    def peachpuff: typingsSlinky.vegaTypings.vegaTypingsStrings.peachpuff = "peachpuff".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.peachpuff]
    
    @scala.inline
    def peru: typingsSlinky.vegaTypings.vegaTypingsStrings.peru = "peru".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.peru]
    
    @scala.inline
    def pink: typingsSlinky.vegaTypings.vegaTypingsStrings.pink = "pink".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.pink]
    
    @scala.inline
    def plum: typingsSlinky.vegaTypings.vegaTypingsStrings.plum = "plum".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.plum]
    
    @scala.inline
    def powderblue: typingsSlinky.vegaTypings.vegaTypingsStrings.powderblue = "powderblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.powderblue]
    
    @scala.inline
    def purple: typingsSlinky.vegaTypings.vegaTypingsStrings.purple = "purple".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.purple]
    
    @scala.inline
    def rebeccapurple: typingsSlinky.vegaTypings.vegaTypingsStrings.rebeccapurple = "rebeccapurple".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.rebeccapurple]
    
    @scala.inline
    def red: typingsSlinky.vegaTypings.vegaTypingsStrings.red = "red".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.red]
    
    @scala.inline
    def rosybrown: typingsSlinky.vegaTypings.vegaTypingsStrings.rosybrown = "rosybrown".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.rosybrown]
    
    @scala.inline
    def royalblue: typingsSlinky.vegaTypings.vegaTypingsStrings.royalblue = "royalblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.royalblue]
    
    @scala.inline
    def saddlebrown: typingsSlinky.vegaTypings.vegaTypingsStrings.saddlebrown = "saddlebrown".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.saddlebrown]
    
    @scala.inline
    def salmon: typingsSlinky.vegaTypings.vegaTypingsStrings.salmon = "salmon".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.salmon]
    
    @scala.inline
    def sandybrown: typingsSlinky.vegaTypings.vegaTypingsStrings.sandybrown = "sandybrown".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.sandybrown]
    
    @scala.inline
    def seagreen: typingsSlinky.vegaTypings.vegaTypingsStrings.seagreen = "seagreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.seagreen]
    
    @scala.inline
    def seashell: typingsSlinky.vegaTypings.vegaTypingsStrings.seashell = "seashell".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.seashell]
    
    @scala.inline
    def sienna: typingsSlinky.vegaTypings.vegaTypingsStrings.sienna = "sienna".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.sienna]
    
    @scala.inline
    def silver: typingsSlinky.vegaTypings.vegaTypingsStrings.silver = "silver".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.silver]
    
    @scala.inline
    def skyblue: typingsSlinky.vegaTypings.vegaTypingsStrings.skyblue = "skyblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.skyblue]
    
    @scala.inline
    def slateblue: typingsSlinky.vegaTypings.vegaTypingsStrings.slateblue = "slateblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.slateblue]
    
    @scala.inline
    def slategray: typingsSlinky.vegaTypings.vegaTypingsStrings.slategray = "slategray".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.slategray]
    
    @scala.inline
    def slategrey: typingsSlinky.vegaTypings.vegaTypingsStrings.slategrey = "slategrey".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.slategrey]
    
    @scala.inline
    def snow: typingsSlinky.vegaTypings.vegaTypingsStrings.snow = "snow".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.snow]
    
    @scala.inline
    def springgreen: typingsSlinky.vegaTypings.vegaTypingsStrings.springgreen = "springgreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.springgreen]
    
    @scala.inline
    def steelblue: typingsSlinky.vegaTypings.vegaTypingsStrings.steelblue = "steelblue".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.steelblue]
    
    @scala.inline
    def tan: typingsSlinky.vegaTypings.vegaTypingsStrings.tan = "tan".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.tan]
    
    @scala.inline
    def teal: typingsSlinky.vegaTypings.vegaTypingsStrings.teal = "teal".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.teal]
    
    @scala.inline
    def thistle: typingsSlinky.vegaTypings.vegaTypingsStrings.thistle = "thistle".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.thistle]
    
    @scala.inline
    def tomato: typingsSlinky.vegaTypings.vegaTypingsStrings.tomato = "tomato".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.tomato]
    
    @scala.inline
    def turquoise: typingsSlinky.vegaTypings.vegaTypingsStrings.turquoise = "turquoise".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.turquoise]
    
    @scala.inline
    def violet: typingsSlinky.vegaTypings.vegaTypingsStrings.violet = "violet".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.violet]
    
    @scala.inline
    def wheat: typingsSlinky.vegaTypings.vegaTypingsStrings.wheat = "wheat".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.wheat]
    
    @scala.inline
    def white: typingsSlinky.vegaTypings.vegaTypingsStrings.white = "white".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.white]
    
    @scala.inline
    def whitesmoke: typingsSlinky.vegaTypings.vegaTypingsStrings.whitesmoke = "whitesmoke".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.whitesmoke]
    
    @scala.inline
    def yellow: typingsSlinky.vegaTypings.vegaTypingsStrings.yellow = "yellow".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.yellow]
    
    @scala.inline
    def yellowgreen: typingsSlinky.vegaTypings.vegaTypingsStrings.yellowgreen = "yellowgreen".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.yellowgreen]
  }
  
  type HexColor = String
}
