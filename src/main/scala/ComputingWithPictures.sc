import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

Image.circle(10).draw
(circle(10) beside circle(10) beside circle(10)) on circle(30)

((circle(10) fillColor Color.black) on
  (circle(20) fillColor Color.cornflowerBlue) on
  (circle(30) fillColor Color.white) on
  (circle(40) fillColor Color.darkBlue)).draw

"Hue, saturation, lightness"
(triangle(20,20) fillColor Color.hsl(0.degrees, 0.8.normalized, 0.6.normalized)).draw

(circle(200) fillColor Color.red beside
  (circle(200) fillColor Color.red.spin(15.degrees) beside
    circle(200) fillColor Color.red.spin(30.degrees))).lineWidth(5.0).draw

(((circle(50) fillColor (Color.red darken 0.2.normalized))
  beside (circle(50) fillColor Color.red)
  beside (circle(50) fillColor (Color.red lighten 0.2.normalized))) above
  ((rectangle(100, 100) fillColor (Color.red desaturate 0.6.normalized))
    beside (rectangle(100, 100) fillColor (Color.red desaturate 0.3.normalized))
    beside (rectangle(100, 100) fillColor Color.red))).draw

((circle(35) fillColor (Color.red.alpha(0.5.normalized))) beside
  (circle(35) fillColor (Color.blue.alpha(0.5.normalized))) on
  (circle(35) fillColor (Color.green.alpha(0.5.normalized)))).draw


((triangle(45, 45) fillColor (Color.blue.alpha(0.5.normalized)) lineWidth 5
  beside (triangle(45, 45) fillColor (Color.pink.alpha(0.5.normalized)) lineWidth 5))
  below (triangle(45, 45) fillColor (Color.purple.alpha(0.5.normalized)) lineWidth 5)).draw

((triangle(40, 40)
  lineWidth 6.0
  lineColor Color.darkSlateBlue
  fillColor (Color.darkSlateBlue lighten 0.3.normalized saturate 0.2.normalized spin 10.degrees)) above
  ((triangle(40, 40)
    lineWidth 6.0
    lineColor (Color.darkSlateBlue spin (-30.degrees))
    fillColor (Color.darkSlateBlue lighten 0.3.normalized saturate 0.2.normalized spin (-20.degrees))) beside
    (triangle(40, 40)
      lineWidth 6.0
      lineColor (Color.darkSlateBlue spin (30.degrees))
      fillColor (Color.darkSlateBlue lighten 0.3.normalized saturate 0.2.normalized spin (40.degrees))))).draw


(((circle(20) fillColor Color.red)
  on (circle(40) fillColor Color.white)
  on (circle(60) fillColor Color.red))
  above rectangle(10, 40)
  above (rectangle(40, 10) fillColor Color.brown)
  above (rectangle(80, 40) fillColor Color.green)).draw