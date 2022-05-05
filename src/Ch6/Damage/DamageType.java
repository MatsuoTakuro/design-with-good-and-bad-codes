package Ch6.Damage;

import java.util.EnumMap;

public enum DamageType {
    hitPoint,
    magicPoint;

    private static final EnumMap<DamageType, Damage> damages = new EnumMap<>(DamageType.class);

    private static void initializeDamages(final Member member) {
        damages.put(hitPoint, new HitPointDamage(member));
        damages.put(magicPoint, new MagicPointDamage(member));
    }

    private Damage newBy(DamageType damageType) {
        return damages.get(damageType);
    }

    public Damage newDamage(final Member member, DamageType damageType) {
        initializeDamages(member);
        return newBy(damageType);
    }
}
