package typingsSlinky.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratorPaths extends js.Object {
  /**
    * Array of paths to decorators that should be available.
    * 
    * decoratorPaths = ['./src/client/decorators']
    */
  var decoratorPaths: js.Array[String] = js.native
  /**
    * Array of decorators (by id) that should be downloaded from the
    *  server before the editor starts 
    * - when set to null all available decorators will be downloaded.
    */
  var decoratorToPreload: Double | Null = js.native
  /**
    * Array of paths (in the requirejs sense) to 
    * css files that should be loaded at start up. 
    * (To use this option a path would typically 
    * have to be added at config.requirejsPaths.)
    */
  var extraCss: js.Array[String] = js.native
  /**
    * Specifies which layout to use 
    * (directory name must be present in any of the provided base-paths).
    * 
    */
  var layout: Default = js.native
  /**
    * Array of base paths that will be mapped from 'panels' in requirejs.
    * 
    * panelPaths = ['../src/client/js/Panels']
    */
  var panelPaths: js.Array[String] = js.native
  /**
    * Array of paths to directories containing SVG-files 
    * that will be copied and made available as SVGs 
    * for decorators (ConstraintIcons is currently reserved).
    */
  var svgDirs: js.Array[String] = js.native
  /**
    * Array of paths to json-files containing meta-data about the used visualizers.
    * 
    * visualizerDescriptors = ['../src/client/js/Visualizers.json']
    */
  var visualizerDescriptors: js.Array[String] = js.native
}

object DecoratorPaths {
  @scala.inline
  def apply(
    decoratorPaths: js.Array[String],
    extraCss: js.Array[String],
    layout: Default,
    panelPaths: js.Array[String],
    svgDirs: js.Array[String],
    visualizerDescriptors: js.Array[String]
  ): DecoratorPaths = {
    val __obj = js.Dynamic.literal(decoratorPaths = decoratorPaths.asInstanceOf[js.Any], extraCss = extraCss.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], panelPaths = panelPaths.asInstanceOf[js.Any], svgDirs = svgDirs.asInstanceOf[js.Any], visualizerDescriptors = visualizerDescriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratorPaths]
  }
  @scala.inline
  implicit class DecoratorPathsOps[Self <: DecoratorPaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecoratorPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoratorPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraCss(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanelPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualizerDescriptors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualizerDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoratorToPreload(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoratorToPreload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoratorToPreloadNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoratorToPreload")(null)
        ret
    }
  }
  
}

