package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autofit extends js.Object {
  
  /**
    * true | false | 1 | 0
    */
  var `auto-fit`: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets whether the scale values will be displayed in scientific notation. Particularly useful when dealing with large numbers. true
    * | false | 1 | 0
    */
  var exponent: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the number of decimals that will be displayed when using scientific notation. Use with the 'exponent' attribute. 5 | 10 | ...
    */
  var `exponent-decimals`: js.UndefOr[Double] = js.native
  
  var guide: js.UndefOr[Linesegmentsize] = js.native
  
  var item: js.UndefOr[Borderradiustopleft] = js.native
  
  var label: js.UndefOr[Borderradiustopleft] = js.native
  
  /**
    * ''horizontal' | 'h' | 'vertical' | 'v' | 'row x col' | 'x col' | 'row x' | 'float''
    */
  var layout: js.UndefOr[String] = js.native
  
  /**
    * Sets the color of the axis line. 'none' | 'transparent' | '#f00' | '#f00 #00f' | 'red yellow' | 'rgb(100, 15, 15)' | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the gap size in case of a non-contiguous line style. 4 | '6px' | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the segment size in case of a non-contiguous line style. 4 | '6px' | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * Logarithmic Scales only: To set the base value, which defaults to Math.E (Euler's number, the base of natural logarithms). Math.E
    * | 10 | 2 | ...
    */
  var `log-base`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's margin/s. 10 | '5px' | '10 20' | '5px 10px 15px 20px' | ...
    */
  var margin: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's bottom margin. 4 | '6px' | ...
    */
  var `margin-bottom`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's left margin. 4 | '6px' | ...
    */
  var `margin-left`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's right margin. 4 | '6px' | ...
    */
  var `margin-right`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's top margin. 4 | '6px' | ...
    */
  var `margin-top`: js.UndefOr[js.Any] = js.native
  
  var markers: js.UndefOr[js.Array[Labelalignment]] = js.native
  
  /**
    * Sets the maximum number of labels that will display along the axis. 5 | 10 | ...
    */
  var `max-labels`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum number of ticks to display on the x axis. 5 | 10 | ...
    */
  var `max-ticks`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum value for the x axis. 'max-value': is one of the multiple ways you can set x axis values. Commonly used with time
    *  series data. Also see 'mix-value': and 'step': 4 | '6px' | ...
    */
  var `max-value`: js.UndefOr[Double] = js.native
  
  var `minor-guide`: js.UndefOr[LinecolorLinegapsize] = js.native
  
  var `minor-tick`: js.UndefOr[LinegapsizeLinesegmentsize] = js.native
  
  /**
    * Sets the number of minor tick marks displayed between the major tick marks. Note that this attribute is required to style the mino
    * r tick marks and/or guides. 5 | 10 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.native
  
  /**
    * Setting 'mirrored': true will reverse/mirror the x axis values. 'scale-x': {} values will read right to left. true | false | 1 | 0
    */
  var mirrored: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the negative symbol just outside of the formatted value. 'standard' | 'currency'
    */
  var negation: js.UndefOr[String] = js.native
  
  /**
    * Sets an offset from the end of the plotted data. This will cause the data to appear as if it were 'squeezed' from the right side.
    * 4 | '6px' | '5%' | 35%' | ...
    */
  var `offset-end`: js.UndefOr[Double] = js.native
  
  /**
    * Sets an offset at the start of the plotted data. This will cause the data to appear as if it were 'squeezed' from the left side. 4
    *  | '6px' | '5%' | '35%' | ...
    */
  var `offset-start`: js.UndefOr[Double] = js.native
  
  /**
    * Sets an x offset that will be applied to the scale-x object. 4 | '6px' | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the placement of the scale object. 'default' | 'opposite'
    */
  var placement: js.UndefOr[String] = js.native
  
  /**
    * To change the scale type from linear (default) to logarithmic. 'lin' | 'log'
    */
  var progression: js.UndefOr[String] = js.native
  
  /**
    * Used on radial charts (pie, radar, gauge) to specify the starting angle of the nodes. -45 | 115 | ...
    */
  var `ref-angle`: js.UndefOr[Double] = js.native
  
  var `ref-line`: js.UndefOr[LinecolorLinegapsize] = js.native
  
  /**
    * To set the value the reference line is drawn at. 1 | 5 | 10 | ...
    */
  var `ref-value`: js.UndefOr[Double] = js.native
  
  var rules: js.UndefOr[js.Array[Rule]] = js.native
  
  /**
    * 5 | 10 | ...
    */
  var `scale-factor`: js.UndefOr[Double] = js.native
  
  /**
    * Setting to true will cause the values on the x axis to use an abbreviated notation with a short unit such as K,M,B, etc. true | fa
    * lse | 1 | 0
    */
  var short: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies which unit of measure to use when short is set to true. K | M | B | KB | MB | GB | TB | PB
    */
  var `short-unit`: js.UndefOr[String] = js.native
  
  /**
    * ['A', 'B'] | ...
    */
  var `show-labels`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the size of the object/shape. 4 | '6px' | ...
    */
  var size: js.UndefOr[js.Any] = js.native
  
  var tick: js.UndefOr[Shadowalpha] = js.native
  
  var tooltip: js.UndefOr[Fontweight] = js.native
  
  var transform: js.UndefOr[A] = js.native
  
  /**
    * An alternative way to create category scale labels. Similar to a 'labels' array, the 'values' array also acts as a maximum scale v
    * alue. [1, 7, 9] | ['Jan', 'Feb', 'Mar', 'Apr'] | ['Q1', 'Q2', 'Q3', 'Q4']
    */
  var values: js.UndefOr[js.Any] = js.native
  
  /**
    * You can set the 'scale-x': { } to 'visible': false to hide the x axis. The x-axis will still calculate plots correctly, however yo
    * u will not be able to see the x axis line or any of the attributes such as scale values. If you simply want to hide the x axis lin
    * e you can utilize 'line-color':'none'. This will remove the visibility of the x axis line and still allow you to style ticks, item
    * s, etc separately, true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * When zooming is enabled, setting zoom-snap to true snaps the zoom area to the nearest data node as a zoom area is selected. By def
    * ault, zoom-snap is set to false. true | false | 1 | 0
    */
  var `zoom-snap`: js.UndefOr[Boolean] = js.native
}
object Autofit {
  
  @scala.inline
  def apply(): Autofit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autofit]
  }
  
  @scala.inline
  implicit class AutofitOps[Self <: Autofit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setAuto-fit`(value: Boolean): Self = this.set("auto-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAuto-fit`: Self = this.set("auto-fit", js.undefined)
    
    @scala.inline
    def setExponent(value: Boolean): Self = this.set("exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExponent: Self = this.set("exponent", js.undefined)
    
    @scala.inline
    def `setExponent-decimals`(value: Double): Self = this.set("exponent-decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteExponent-decimals`: Self = this.set("exponent-decimals", js.undefined)
    
    @scala.inline
    def setGuide(value: Linesegmentsize): Self = this.set("guide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuide: Self = this.set("guide", js.undefined)
    
    @scala.inline
    def setItem(value: Borderradiustopleft): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setLabel(value: Borderradiustopleft): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def `setLine-color`(value: String): Self = this.set("line-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-color`: Self = this.set("line-color", js.undefined)
    
    @scala.inline
    def `setLine-gap-size`(value: js.Any): Self = this.set("line-gap-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-gap-size`: Self = this.set("line-gap-size", js.undefined)
    
    @scala.inline
    def `setLine-segment-size`(value: js.Any): Self = this.set("line-segment-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-segment-size`: Self = this.set("line-segment-size", js.undefined)
    
    @scala.inline
    def `setLog-base`(value: js.Any): Self = this.set("log-base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLog-base`: Self = this.set("log-base", js.undefined)
    
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def `setMargin-bottom`(value: js.Any): Self = this.set("margin-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMargin-bottom`: Self = this.set("margin-bottom", js.undefined)
    
    @scala.inline
    def `setMargin-left`(value: js.Any): Self = this.set("margin-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMargin-left`: Self = this.set("margin-left", js.undefined)
    
    @scala.inline
    def `setMargin-right`(value: js.Any): Self = this.set("margin-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMargin-right`: Self = this.set("margin-right", js.undefined)
    
    @scala.inline
    def `setMargin-top`(value: js.Any): Self = this.set("margin-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMargin-top`: Self = this.set("margin-top", js.undefined)
    
    @scala.inline
    def setMarkersVarargs(value: Labelalignment*): Self = this.set("markers", js.Array(value :_*))
    
    @scala.inline
    def setMarkers(value: js.Array[Labelalignment]): Self = this.set("markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    
    @scala.inline
    def `setMax-labels`(value: Double): Self = this.set("max-labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-labels`: Self = this.set("max-labels", js.undefined)
    
    @scala.inline
    def `setMax-ticks`(value: Double): Self = this.set("max-ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-ticks`: Self = this.set("max-ticks", js.undefined)
    
    @scala.inline
    def `setMax-value`(value: Double): Self = this.set("max-value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-value`: Self = this.set("max-value", js.undefined)
    
    @scala.inline
    def `setMinor-guide`(value: LinecolorLinegapsize): Self = this.set("minor-guide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMinor-guide`: Self = this.set("minor-guide", js.undefined)
    
    @scala.inline
    def `setMinor-tick`(value: LinegapsizeLinesegmentsize): Self = this.set("minor-tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMinor-tick`: Self = this.set("minor-tick", js.undefined)
    
    @scala.inline
    def `setMinor-ticks`(value: Double): Self = this.set("minor-ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMinor-ticks`: Self = this.set("minor-ticks", js.undefined)
    
    @scala.inline
    def setMirrored(value: Boolean): Self = this.set("mirrored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMirrored: Self = this.set("mirrored", js.undefined)
    
    @scala.inline
    def setNegation(value: String): Self = this.set("negation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegation: Self = this.set("negation", js.undefined)
    
    @scala.inline
    def `setOffset-end`(value: Double): Self = this.set("offset-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-end`: Self = this.set("offset-end", js.undefined)
    
    @scala.inline
    def `setOffset-start`(value: Double): Self = this.set("offset-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-start`: Self = this.set("offset-start", js.undefined)
    
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = this.set("offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-x`: Self = this.set("offset-x", js.undefined)
    
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setProgression(value: String): Self = this.set("progression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgression: Self = this.set("progression", js.undefined)
    
    @scala.inline
    def `setRef-angle`(value: Double): Self = this.set("ref-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteRef-angle`: Self = this.set("ref-angle", js.undefined)
    
    @scala.inline
    def `setRef-line`(value: LinecolorLinegapsize): Self = this.set("ref-line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteRef-line`: Self = this.set("ref-line", js.undefined)
    
    @scala.inline
    def `setRef-value`(value: Double): Self = this.set("ref-value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteRef-value`: Self = this.set("ref-value", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def `setScale-factor`(value: Double): Self = this.set("scale-factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScale-factor`: Self = this.set("scale-factor", js.undefined)
    
    @scala.inline
    def setShort(value: Boolean): Self = this.set("short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
    
    @scala.inline
    def `setShort-unit`(value: String): Self = this.set("short-unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteShort-unit`: Self = this.set("short-unit", js.undefined)
    
    @scala.inline
    def `setShow-labels`(value: js.Any): Self = this.set("show-labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteShow-labels`: Self = this.set("show-labels", js.undefined)
    
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTick(value: Shadowalpha): Self = this.set("tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    
    @scala.inline
    def setTooltip(value: Fontweight): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTransform(value: A): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def `setZoom-snap`(value: Boolean): Self = this.set("zoom-snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteZoom-snap`: Self = this.set("zoom-snap", js.undefined)
  }
}
