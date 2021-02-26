package typingsSlinky.typeorm

import typingsSlinky.typeorm.typeormStrings.STORED
import typingsSlinky.typeorm.typeormStrings.VIRTUAL
import typingsSlinky.typeorm.typeormStrings.increment
import typingsSlinky.typeorm.typeormStrings.rowid
import typingsSlinky.typeorm.typeormStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableColumnOptionsMod {
  
  @js.native
  trait TableColumnOptions extends StObject {
    
    /**
      * Column's default value.
      */
    var default: js.UndefOr[js.Any] = js.native
    
    /**
      * Generated column expression. Supports only in MySQL.
      */
    var asExpression: js.UndefOr[String] = js.native
    
    /**
      * Defines column character set.
      */
    var charset: js.UndefOr[String] = js.native
    
    /**
      * Defines column collation.
      */
    var collation: js.UndefOr[String] = js.native
    
    /**
      * Column's comment.
      */
    var comment: js.UndefOr[String] = js.native
    
    /**
      * Array of possible enumerated values.
      */
    var enum: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Exact name of enum
      */
    var enumName: js.UndefOr[String] = js.native
    
    /**
      * Generated column type. Supports only in MySQL.
      */
    var generatedType: js.UndefOr[VIRTUAL | STORED] = js.native
    
    /**
      * Specifies generation strategy if this column will use auto increment.
      */
    var generationStrategy: js.UndefOr[uuid | increment | rowid] = js.native
    
    /**
      * Indicates if column stores array.
      */
    var isArray: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if column is auto-generated sequence.
      */
    var isGenerated: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if column is NULL, or is NOT NULL in the database.
      */
    var isNullable: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if column is a primary key.
      */
    var isPrimary: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if column has unique value.
      */
    var isUnique: js.UndefOr[Boolean] = js.native
    
    /**
      * Column type's length. Used only on some column types.
      * For example type = "string" and length = "100" means that ORM will create a column with type varchar(100).
      */
    var length: js.UndefOr[String] = js.native
    
    /**
      * Column name.
      */
    var name: String = js.native
    
    /**
      * ON UPDATE trigger. Works only for MySQL.
      */
    var onUpdate: js.UndefOr[String] = js.native
    
    /**
      * The precision for a decimal (exact numeric) column (applies only for decimal column), which is the maximum
      * number of digits that are stored for the values.
      */
    var precision: js.UndefOr[Double | Null] = js.native
    
    /**
      * The scale for a decimal (exact numeric) column (applies only for decimal column), which represents the number
      * of digits to the right of the decimal point and must not be greater than precision.
      */
    var scale: js.UndefOr[Double] = js.native
    
    /**
      * Spatial Feature Type (Geometry, Point, Polygon, etc.)
      */
    var spatialFeatureType: js.UndefOr[String] = js.native
    
    /**
      * SRID (Spatial Reference ID (EPSG code))
      */
    var srid: js.UndefOr[Double] = js.native
    
    /**
      * Column type.
      */
    var `type`: String = js.native
    
    /**
      * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
      */
    var unsigned: js.UndefOr[Boolean] = js.native
    
    /**
      * Column type's display width. Used only on some column types in MySQL.
      * For example, INT(4) specifies an INT with a display width of four digits.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
      * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to the column
      */
    var zerofill: js.UndefOr[Boolean] = js.native
  }
  object TableColumnOptions {
    
    @scala.inline
    def apply(name: String, `type`: String): TableColumnOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableColumnOptions]
    }
    
    @scala.inline
    implicit class TableColumnOptionsMutableBuilder[Self <: TableColumnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsExpression(value: String): Self = StObject.set(x, "asExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsExpressionUndefined: Self = StObject.set(x, "asExpression", js.undefined)
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumName(value: String): Self = StObject.set(x, "enumName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumNameUndefined: Self = StObject.set(x, "enumName", js.undefined)
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setGeneratedType(value: VIRTUAL | STORED): Self = StObject.set(x, "generatedType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratedTypeUndefined: Self = StObject.set(x, "generatedType", js.undefined)
      
      @scala.inline
      def setGenerationStrategy(value: uuid | increment | rowid): Self = StObject.set(x, "generationStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerationStrategyUndefined: Self = StObject.set(x, "generationStrategy", js.undefined)
      
      @scala.inline
      def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      @scala.inline
      def setIsGenerated(value: Boolean): Self = StObject.set(x, "isGenerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGeneratedUndefined: Self = StObject.set(x, "isGenerated", js.undefined)
      
      @scala.inline
      def setIsNullable(value: Boolean): Self = StObject.set(x, "isNullable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNullableUndefined: Self = StObject.set(x, "isNullable", js.undefined)
      
      @scala.inline
      def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
      
      @scala.inline
      def setIsUnique(value: Boolean): Self = StObject.set(x, "isUnique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUniqueUndefined: Self = StObject.set(x, "isUnique", js.undefined)
      
      @scala.inline
      def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionNull: Self = StObject.set(x, "precision", null)
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSpatialFeatureType(value: String): Self = StObject.set(x, "spatialFeatureType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpatialFeatureTypeUndefined: Self = StObject.set(x, "spatialFeatureType", js.undefined)
      
      @scala.inline
      def setSrid(value: Double): Self = StObject.set(x, "srid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSridUndefined: Self = StObject.set(x, "srid", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZerofill(value: Boolean): Self = StObject.set(x, "zerofill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZerofillUndefined: Self = StObject.set(x, "zerofill", js.undefined)
    }
  }
}
