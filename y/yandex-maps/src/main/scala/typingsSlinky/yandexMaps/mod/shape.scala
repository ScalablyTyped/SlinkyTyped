package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.anon.Fill
import typingsSlinky.yandexMaps.anon.StrokeWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "shape")
@js.native
object shape extends js.Object {
  @js.native
  class Circle protected () extends IShape {
    def this(pixelGeometry: IPixelCircleGeometry) = this()
    def this(pixelGeometry: IPixelCircleGeometry, params: Fill) = this()
    /* CompleteClass */
    override def contains(position: js.Array[Double]): Boolean = js.native
    /* CompleteClass */
    override def equals(shape: IShape): Boolean = js.native
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    /* CompleteClass */
    override def getGeometry(): IPixelGeometry = js.native
    /* CompleteClass */
    override def getType(): String = js.native
    /* CompleteClass */
    override def scale(factor: Double): IShape = js.native
    /* CompleteClass */
    override def shift(offset: js.Array[Double]): IShape = js.native
  }
  
  @js.native
  class LineString protected () extends IShape {
    def this(pixelGeometry: IPixelLineStringGeometry) = this()
    def this(pixelGeometry: IPixelLineStringGeometry, params: StrokeWidth) = this()
    /* CompleteClass */
    override def contains(position: js.Array[Double]): Boolean = js.native
    /* CompleteClass */
    override def equals(shape: IShape): Boolean = js.native
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    /* CompleteClass */
    override def getGeometry(): IPixelGeometry = js.native
    /* CompleteClass */
    override def getType(): String = js.native
    /* CompleteClass */
    override def scale(factor: Double): IShape = js.native
    /* CompleteClass */
    override def shift(offset: js.Array[Double]): IShape = js.native
  }
  
  @js.native
  class MultiPolygon protected () extends IShape {
    def this(pixelGeometry: IPixelMultiPolygonGeometry) = this()
    def this(pixelGeometry: IPixelMultiPolygonGeometry, params: Fill) = this()
    /* CompleteClass */
    override def contains(position: js.Array[Double]): Boolean = js.native
    /* CompleteClass */
    override def equals(shape: IShape): Boolean = js.native
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    /* CompleteClass */
    override def getGeometry(): IPixelGeometry = js.native
    /* CompleteClass */
    override def getType(): String = js.native
    /* CompleteClass */
    override def scale(factor: Double): IShape = js.native
    /* CompleteClass */
    override def shift(offset: js.Array[Double]): IShape = js.native
  }
  
  @js.native
  class Polygon protected () extends IShape {
    def this(pixelGeometry: IPixelPolygonGeometry) = this()
    def this(pixelGeometry: IPixelPolygonGeometry, params: Fill) = this()
    /* CompleteClass */
    override def contains(position: js.Array[Double]): Boolean = js.native
    /* CompleteClass */
    override def equals(shape: IShape): Boolean = js.native
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    /* CompleteClass */
    override def getGeometry(): IPixelGeometry = js.native
    /* CompleteClass */
    override def getType(): String = js.native
    /* CompleteClass */
    override def scale(factor: Double): IShape = js.native
    /* CompleteClass */
    override def shift(offset: js.Array[Double]): IShape = js.native
  }
  
  @js.native
  class Rectangle protected () extends IShape {
    def this(geometry: IPixelRectangleGeometry) = this()
    def this(geometry: IPixelRectangleGeometry, params: Fill) = this()
    /* CompleteClass */
    override def contains(position: js.Array[Double]): Boolean = js.native
    /* CompleteClass */
    override def equals(shape: IShape): Boolean = js.native
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    /* CompleteClass */
    override def getGeometry(): IPixelGeometry = js.native
    /* CompleteClass */
    override def getType(): String = js.native
    /* CompleteClass */
    override def scale(factor: Double): IShape = js.native
    /* CompleteClass */
    override def shift(offset: js.Array[Double]): IShape = js.native
  }
  
}

