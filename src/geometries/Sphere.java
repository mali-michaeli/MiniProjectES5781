package geometries;

import primitives.Point3D;
import primitives.Util;
import primitives.Vector;

public abstract class Sphere {
    Point3D _center;
    double _radius;


    public Sphere(double radius,Point3D center) {
        center=_center;
        radius=_radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        if (!(o instanceof Sphere)) return  false;
        Sphere other = (Sphere) o;
        return this._center.equals(other._center) && (Util.isZero(this._radius - other._radius));
    }

    public Point3D get_center() {

        return _center;
    }

    public Vector getNormal(Point3D p) {
        Vector normal = p.subtract(_center);
        return normal.normalize();
    }


}